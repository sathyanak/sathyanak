package net.stafftrack.fw.security.bl.constants;

public enum LtCountryIdTypeConstants {
	UNITED_STATES_COUNTRY_ID(1),US_ISLANDS(2),CANADA_COUNTRY_ID(3),MEXICO_COUNTRY_ID(4);
	
	private int ltCountryId;
	
	private LtCountryIdTypeConstants(int id)
	{
		this.ltCountryId = id;
	}

	public int getCountryTypeId()
	{
		return ltCountryId;
	}
}
