/**
 * 
 */
package net.sathyan.valueobjects;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author skizhekethil
 *
 */

@XmlRootElement(name="attendancestatusresponse")
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class EmployeeVO {

	private String firstName;
	private String lastName;
	private Date dob;
	private int age;
	private String dept;
	private String manager;
	private String type;
	private Float allowance;
	
	private EmployeeVO()
	{
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public EmployeeVO(String firstName, String lastName, int age, String type, Float allowance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.type = type;
		this.allowance = allowance;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getAllowance() {
		return allowance;
	}

	public void setAllowance(Float allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return "EmployeeVO [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", age=" + age
				+ ", dept=" + dept + ", manager=" + manager + ", type=" + type + ", allowance=" + allowance + "]";
	}

}
