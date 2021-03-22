package jsf.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.primefaces.component.button.Button;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.SelectEvent;

import model.valueobjects.StandardVO;

@ManagedBean (name="openDialog")
@ViewScoped
public class OpenDialog implements Serializable {

	
	private static final long serialVersionUID = -2776725772598162198L;
	
	
	//List of objects
	private List<StandardVO>  list = new ArrayList<StandardVO>();
	protected StandardVO selectedItem;
	
	protected String stPay;
	protected String otPay;
	protected String dtPay;

	
	
	public String getStPay() {
		return stPay;
	}


	public void setStPay(String stPay) {
		this.stPay = stPay;
	}


	public String getOtPay() {
		return otPay;
	}


	public void setOtPay(String otPay) {
		this.otPay = otPay;
	}


	public String getDtPay() {
		return dtPay;
	}


	public void setDtPay(String dtPay) {
		this.dtPay = dtPay;
	}


	public StandardVO getSelectedItem() {
		return selectedItem;
	}


	public void setSelectedItem(StandardVO selectedItem) {
		this.selectedItem = selectedItem;
	}


	@PostConstruct
    public void init(){
		selectedItem = new StandardVO(0, " ", new Date(), "" , 
				"", "", "", true, 90);
		
		//Initialise the Liset of Objects;
		System.out.println ("gggggg");
		
		int i = 1;
		
		list.add(new StandardVO(i, "Sathyan, TRueblue", new Date(), "888-99-0000" + i, 
				"HR", "808-907-9000", "Maruti Wagonr", true, 90));
		
		list.add(new StandardVO(i, "Athira", new Date(), "888-99-0000" + i, 
				"HR", "808-907-9000", "Ambassador", true, 91));
		
		list.add(new StandardVO(i, "Zakaria", new Date(), "888-99-0000" + i, 
				"HR", "808-907-9000", "Maruti Wagonr", true, 90));
		
		
		
		
		
    }
	
	public void updateGrid()
	{
		list.add(this.getSelectedItem());
		System.out.println("tested");
		return;
		
	}
	
	public void testBlur()
	{
		this.getSelectedItem().setPhone("Test Sathyan");
		
		this.setOtPay("20");
		this.setDtPay("30");
		
		return;
		
	}
	
	
	public void onRowSelect(SelectEvent event)
	{
		
		HttpServletRequest request =  (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest() ;
		//Object vo  = (Object) StandardVO;
		
		this.selectedItem  = (StandardVO) (event.getObject()) ;
		
	  try {
		FacesContext.getCurrentInstance().getExternalContext().redirect("dataTables.xhtml?officeId = " + this.selectedItem.getEmpId());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

		//System.out.println(vo1.toString());
	}
	
	
	
	public void checked()
	{
		HttpServletRequest request =  (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest() ;
		StandardVO vo  = (StandardVO) request.getAttribute("editableList");
		
		System.out.println(vo.toString());
	}
	
	public void updateCars()
	{
		   DataTable  dataTable = (DataTable) FacesContext.getCurrentInstance().getViewRoot().findComponent("form:empList");
		   System.out.println(dataTable.getPage());
		   
		   Button button =  (Button) FacesContext.getCurrentInstance().getViewRoot().findComponent("form:two");
		   
		   if (dataTable.getPage() == 4)
		   {
			   //HtmlPanelGroup btn =  (HtmlPanelGroup) FacesContext.getCurrentInstance().getViewRoot().findComponent("form:pan");
			  //System.out.println(btn.getId());
			  
			
//			  System.out.println(btn.getId());
			  
			  button.setStyle("display:none");
		   }
		   else
		   {
			   button.setStyle("display:inline");
		   }
		   
		   //Action to save

		for (int i=0;i <50; i++)
		{
			StandardVO vo= (StandardVO) list.get(i);
			System.out.println(vo.toString());
		}
	}
	 

	public List<StandardVO> getList() {
		return list;
	}

	public void setList(List<StandardVO> list) {
		this.list = list;
	}
	
	
}
