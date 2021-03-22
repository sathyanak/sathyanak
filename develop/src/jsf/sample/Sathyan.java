package jsf.sample;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="sathyan")
@ViewScoped
public class Sathyan implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ssn = "Sathyan";
	public static final String SSN_FORMAT = "222-332322";
	
	
	
	
	
	public String getSsn()
	{
		return ssn;
	}
	public void setSsn(String ssn)
	{
		this.ssn = ssn;
	}
	
	public String getSystemName()
	{
		return "This is a system";
	}

	
}
