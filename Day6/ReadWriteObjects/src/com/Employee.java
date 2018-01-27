package com;

import java.io.Serializable;

//Serializable interface has no methods in it, hence it is called as Marker Interface
public class Employee implements Serializable {
	
	//Best Practice is use System Generated Serial version UID
	private static final long serialVersionUID = 5345095258332971367L;
	
	//private static final long serialVersionUID = 1L;
	
	private int empId;
	private String empName;
	//private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
}
