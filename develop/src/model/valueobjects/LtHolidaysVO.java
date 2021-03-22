
package model.valueobjects;

import java.io.Serializable;

public class LtHolidaysVO implements Serializable
{ 
	@Override
	public String toString() {
		return "LtHolidaysVO [ltHolidayName=" + ltHolidayName + ", ltHolidayId=" + ltHolidayId + "]";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -363260234687264150L;


	public LtHolidaysVO(String ltHolidayName, Long ltHolidayId) {
		super();
		this.ltHolidayName = ltHolidayName;
		this.ltHolidayId = ltHolidayId;
	}
	String ltHolidayName;
	Long ltHolidayId;
	
	
	public String getLtHolidayName()
	{
		return ltHolidayName;
	}
	public void setLtHolidayName(String ltHolidayName)
	{
		this.ltHolidayName = ltHolidayName;
	}
	public Long getLtHolidayId()
	{
		return ltHolidayId;
	}
	public void setLtHolidayId(Long ltHolidayId)
	{
		this.ltHolidayId = ltHolidayId;
	}
}
