package employee.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Message {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long employeeid;
	private String employeename;
	private String employeesalary;
	public long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(String employeesalary) {
		this.employeesalary = employeesalary;
	}

}
