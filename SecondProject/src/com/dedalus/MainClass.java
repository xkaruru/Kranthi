
package com.dedalus;

class Employee {

	 int empno=1;
	 String ename = "Asha";

	 Salary sal;
	
	
	
//	public Employee() {
//	  System.out.println("From Employee Constructor");
//	  sal=new Salary();
//	}
	
	

	public String getDetails() {
//		Salary sal =new Salary();
		return (empno + " -- " + ename + " --- " + sal);
	}
	 
	 public void Details() {
		System.out.println("Regular method");
		}
	

    public void salary(double bs) {
		    sal=new Salary();
    	    sal.setBasic(bs);
	        sal.setDa(0.2 * bs); 
	        sal.setPf(0.1 * bs); 
	        sal.setGross(bs + sal.getDa() - sal.getPf());
	        sal.setNet(sal.getGross());
		
	}

}

class Manager extends Employee {
	String dept = "IT";
		
	public String getDetails() {
//		Salary sal =new Salary();
		return (empno + " -- " + ename + " --- " + dept);
	}
	
	public void normal() {
		System.out.println(" method");
	}


}

public class MainClass {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
//		Salary sal=new Salary();
		emp.salary(1000);
        System.out.println(emp.getDetails());
        
        Manager mgr = new Manager();
        System.out.println(mgr.getDetails());
        
        Employee e= new Manager(); // for employee it allows regular m but manager allows overridden only
        e.Details();
        
        if(emp instanceof Manager) {
        	System.out.println("employee method");
        }else {
        	System.out.println("manager method");
        }
		


	}

}