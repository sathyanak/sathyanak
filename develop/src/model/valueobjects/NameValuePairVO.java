/*
 * Created on June 7, 2017
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package model.valueobjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author vjanardhanan
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class NameValuePairVO
	implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2580896782941185898L;

	//private static final long serialVersionUID = 2322034970707622537L ;
	private int hashCode ;
	
	private Long id;
    private String shortDesc;
    private String desc;
    
    private String toDesc;

    public NameValuePairVO ()
    {
       
    }
    
    
    //Constructors for important types.
    public NameValuePairVO (Long id, String desc)
    {
        this.id = id;
        this.desc = desc;
    }

    public NameValuePairVO (Long id, String desc, String shortDesc)
    {
        this.id = id;
        this.desc = desc;
        this.shortDesc = shortDesc;
    }

    
    
    public NameValuePairVO (Long id, String desc, String shortDesc,String toDesc)
    {
        this.id = id;
        this.desc = desc;
        this.shortDesc = shortDesc;
        this.toDesc = toDesc;
    }
    
   


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getShortDesc() {
        return shortDesc;
    }
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
    

  public String getToDesc() {
		return toDesc;
	}

	public void setToDesc(String toDesc) {
		this.toDesc = toDesc;
	}

	
  
    
    @Override
    public String toString()
    {
        return String.format( "%s[id=%d] code=[%s] desc=[%s]", getClass().getSimpleName(), getId(), getShortDesc(), getDesc() ) ;
    }

	@Override
	public int hashCode( )
	{
		if ( hashCode == 0 )
		{
			hashCode = hashCode * 31 + (getId() == null ? 0 : getId().hashCode()) ;
			hashCode = hashCode * 31 + (getShortDesc() == null ? 0 : getShortDesc().hashCode()) ;
			hashCode = hashCode * 31 + (getDesc() == null ? 0 : getDesc().hashCode()) ;
		}

		return hashCode ;
	}

	@Override
	public boolean equals( Object obj )
	{
		if ( this == obj )
			return true ;
		
		if ( !( obj instanceof NameValuePairVO) )
			return false ;
		
		NameValuePairVO nvp = (NameValuePairVO)obj ;
		
		return getId().equals( nvp.getId() )
			&& getShortDesc().equals( nvp.getShortDesc() )
			&& getDesc().equals( nvp.getDesc() ) ;
	}
	
	//15984-CRM communications - Get a list of NameValuePairVOs for activity status.
    public static List<NameValuePairVO> getActivityStatusTypes()
    {
        List list = new ArrayList();
        NameValuePairVO vo1 = new NameValuePairVO();
        vo1.setShortDesc("Y"); //is_Active = Y
        vo1.setDesc("Active");
        list.add(vo1);
        NameValuePairVO vo2 = new NameValuePairVO();
        vo2.setShortDesc("N"); //is_active = N
        vo2.setDesc("Closed");
        list.add(vo2);
        return list;
    }
    
    
}
