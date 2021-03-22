package model;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.primefaces.component.button.Button;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.SelectEvent;

import model.valueobjects.StandardVO;

@ManagedBean(name = "standard")
@ViewScoped
public class StandardBean implements Serializable {

	private static final long serialVersionUID = -2776725772598162198L;

	// List of objects
	private List<StandardVO> list = new ArrayList<StandardVO>();
	private StandardVO selectedItem;

	private String testStr = "Sathyan";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	private List<String> testList = new ArrayList<String>();

	public List<String> getTestList() {
		return testList;
	}

	public void setTestList(List<String> testList) {
		this.testList = testList;
	}

	private Long percentId;

	public Long getPercentId() {
		return percentId;
	}

	public void setPercentId(Long percentId) {
		this.percentId = percentId;
	}

	public StandardVO getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(StandardVO selectedItem) {
		this.selectedItem = selectedItem;
	}

	@PostConstruct
	public void init() {

		// Initialise the Liset of Objects;
		System.out.println("gggggg");

//		for (int i=0;i <5; i++)
//		{
//			list.add(new StandardVO(i, "Sathyan", new Date(), "888-99-0000" + i, 
//					"HR", "808-907-9000", "This is a long description first Row", true, 90));
//		
//			list.add(new StandardVO(i, "Jyothi", new Date(), "888-99-1111" + i, 
//				"HR", "808-907-9000", "This is a long description second Row", true, 90));
//		
//		}
		int i = 0;

		list.add(new StandardVO(i, "Sathyan, TRueblue", new Date(), "Short DESC First" + i, "None", "Observation",
				"This is a long description first Row", true, 90));

		i++;
		list.add(new StandardVO(i, "Athira", new Date(), "Short DESC First " + i, "Smith, John", "Conservative",
				"Thus us again a long Second DESC ", true, 91));

		i++;
		list.add(new StandardVO(i, "Zakaria", new Date(), "Short DESC First " + i, "Lynch, Lichee", "Opportinuty",
				"Rest Long desc", true, 90));

//		list.add(new StandardVO(i, "Neil", new Date(), "888-99-0000" + i, 
//				"HR", "808-907-9000", "Celerio", true, 90));
//		
//		list.add(new StandardVO(i, "Kevin", new Date(), "888-99-0000" + i, 
//				"HR", "808-907-9000", "Premier", true, 92));
//		
//		list.add(new StandardVO(i, "Arya", new Date(), "888-99-0000" + i, 
//				"HR", "808-907-9000", "Audi", true, 90));
//		
//		list.add(new StandardVO(i, "PAppu", new Date(), "888-99-0000" + i, 
//				"HR", "808-907-9000", "Maruti Wagonr", true, 99));
//		
//		list.add(new StandardVO(i, "Motilal", new Date(), "888-99-0000" + i, 
//				"HR", "808-907-9000", "Maruti Wagonr", true, 2));
//		
//		list.add(new StandardVO(i, "Sangu", new Date(), "888-99-0000" + i, 
//				"HR", "808-907-9000", "Maruti Wagonr", true, 3));
//		
//		list.add(new StandardVO(i, "Sathyan", new Date(), "888-99-0000" + i, 
//				"HR", "808-907-9000", "Fiat", true, 90));
//		

	}

	public void showMe(SelectEvent event) {
		System.out.println("ppp");
	}

	public void onRowSelect(SelectEvent event) {

		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		// Object vo = (Object) StandardVO;

		this.selectedItem = (StandardVO) (event.getObject());

		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("dataTables.xhtml?officeId = " + this.selectedItem.getEmpId());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(vo1.toString());
	}

	public void checked() {
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		StandardVO vo = (StandardVO) request.getAttribute("editableList");

		System.out.println(vo.toString());
	}

	public void testRowclick() {

		// HttpServletResponse response = (HttpServletResponse)
		// FacesContext.getCurrentInstance().getExternalContext().getResponse();

		// response.reset();
		try {
			// response.getOutputStream().flush();
			// response.getOutputStream().close();

			HSSFWorkbook book = new HSSFWorkbook();
			HSSFSheet sheet = (HSSFSheet) book.createSheet("Test POI Template");

			//Set the font
			Font summaryFont = book.createFont();
			summaryFont.setFontHeightInPoints((short) 14);
			summaryFont.setFontName("Arial");
			// font.setColor(IndexedColors.BLACK.getIndex());
			summaryFont.setBold(true);
			summaryFont.setItalic(true);

			Font headingfont = book.createFont();
			headingfont.setFontHeightInPoints((short) 11);
			headingfont.setFontName("Arial");
			// font.setColor(IndexedColors.BLACK.getIndex());
			headingfont.setBold(true);
			headingfont.setItalic(false);

			Row row = sheet.createRow(0);
			CellStyle style = book.createCellStyle();

			style.setFont(summaryFont);
			style.setAlignment(HorizontalAlignment.CENTER);
			row.setRowStyle(style);

			Cell cell = row.createCell(0);
			cell.setCellValue("Heading : Report");
			cell.setCellStyle(style);
			
			// The summary section. Coordinates of the are that needs to be in the summary
			sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 14));

		
			 row = sheet.createRow(1);
			cell = row.createCell(0);
			cell.setCellValue("Statistics");
			cell.setCellStyle(style);
			
			// The summary section. Coordinates of the are that needs to be in the summary
			sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, 14));
			

			style = book.createCellStyle();
			style.setFont(headingfont);

			row = sheet.createRow(4);

			// Header data
			for (int j = 0; j < 15; j++) {
				cell = row.createCell(j);
				cell.setCellValue(" Header " + j);
				cell.setCellStyle(style);
			}

			// For each that is the data
			for (int i = 5; i < 10; i++) {
				row = sheet.createRow(i);

				for (int j = 0; j < 15; j++) {
					cell = row.createCell(j);
					cell.setCellValue(" Value at " + j);
				}

			}

			System.out.println("On row click");

//			 FacesContext fc = FacesContext.getCurrentInstance();
//			  ExternalContext ec = fc.getExternalContext();
//
//			    ec.responseReset(); // Some JSF component library or some Filter might have set some headers in the buffer beforehand. We want to get rid of them, else it may collide.
//			    ec.setResponseContentType("application/vnd.ms-excel"); // Check http://www.iana.org/assignments/media-types for all types. Use if necessary ExternalContext#getMimeType() for auto-detection based on filename.
//			    //ec.setResponseContentLength(contentLength); // Set it with the file size. This header is optional. It will work if it's omitted, but the download progress will be unknown.
//			    ec.setResponseHeader("Content-disposition", "attachment;filename=1.xls"); // The Save As popup magic is done here. You can give it any file name you want, this only won't work in MSIE, it will use current request URL as file name instead.
//
//			    OutputStream output = ec.getResponseOutputStream();
//			    // Now you can write the InputStream of the file to the above OutputStream the usual way.
//			    // ...
//			    book.write(output);
//			    fc.responseComplete(); // Important! O

			HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext()
					.getResponse();

			response.setContentType("application/xls");
			response.setHeader("Content-Disposition", "attachment;filename=instructions.xls");
			book.write(response.getOutputStream());
			response.getOutputStream().flush();
			response.getOutputStream().close();
			FacesContext.getCurrentInstance().responseComplete();
			
			book.close();

//			book.write(response.getOutputStream());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			//Close the stream and all resources here ! Important.
		}
	}

	public void updateCars() {
		DataTable dataTable = (DataTable) FacesContext.getCurrentInstance().getViewRoot().findComponent("form:empList");
		System.out.println(dataTable.getPage());

		Button button = (Button) FacesContext.getCurrentInstance().getViewRoot().findComponent("form:two");

		if (dataTable.getPage() == 4) {
			// HtmlPanelGroup btn = (HtmlPanelGroup)
			// FacesContext.getCurrentInstance().getViewRoot().findComponent("form:pan");
			// System.out.println(btn.getId());

//			  System.out.println(btn.getId());

			button.setStyle("display:none");
		} else {
			button.setStyle("display:inline");
		}

		// Action to save

		for (int i = 0; i < 50; i++) {
			StandardVO vo = (StandardVO) list.get(i);
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
