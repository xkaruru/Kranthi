
package com.dedalus.model;

import java.io.Serializable;

public class Employee implements Serializable{
	private int empno;
	private String ename;

	

	public Employee(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + "]";
	}

}