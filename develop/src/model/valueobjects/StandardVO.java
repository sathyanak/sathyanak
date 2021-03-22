package model.valueobjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StandardVO implements Serializable{
	
	@Override
	public String toString() {
		return "StandardVO [empId=" + empId + ", name=" + name + ", dob=" + dob + ", ssn=" + ssn + ", department="
				+ department + ", phone=" + phone + ", vehicle=" + vehicle + ", active=" + active + ", exp=" + exp
				+ "]";
	}
	
	private static final long serialVersionUID = 1L;

	private int empId;
	private String name;
	private Date dob;
	private String ssn;
	private String department;
	private String phone;
	private String vehicle;
	private boolean active;
	public List<String> getDesc() {
		return desc;
	}


	public void setDesc(List<String> desc) {
		this.desc = desc;
	}

	private int exp;
	private List<String> desc = new ArrayList<String>();
	
	
	
	public StandardVO(int empId, String name, Date dob, String ssn, String department, String phone, String vehicle,
			boolean active, int exp) {
		super();
		this.empId = empId;
		this.name = name;
		this.dob = dob;
		this.ssn = ssn;
		this.department = department;
		this.phone = phone;
		this.vehicle = vehicle;
		this.active = active;
		this.exp = exp;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public int getExpPercent()
	{
		return exp/100;
	}
}
