
package com.dedalus.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dedalus.model.Employee;



public class EmployeeController implements EmployeeInterface {
	
	Scanner sc = new Scanner(System.in);
	Employee emp;
	List emplist = new ArrayList<>(); 
	public void addEmployee()
	{		
		emp = new Employee();
		System.out.println("Enter Eno");
		int eno =sc.nextInt();
		emp.setEmpno(eno);
		
		System.out.println("Enter Ename");
		String ename =sc.next();
		emp.setEname(ename);
		emplist.add(emp);
		System.out.println("Employee Added Successfully");
		
	}
	
	public void viewEmployee() {
		
		
		System.out.println(emplist);
	}

	
	public void Serialize() {
		
		try {
		System.out.println("Enter Eno");
		int eno =sc.nextInt();
		
		
		System.out.println("Enter Ename");
		String ename =sc.next();
		
		 emp=new Employee(eno,ename);
		//converting object to byte code
		FileOutputStream fos = new FileOutputStream("dedalus.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp);
		System.out.println("Serilized to file dedalus.txt");
		oos.close();
		fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("No file");
		}
		
	}

	
	public void Deseriize() {
		try{
			
			FileInputStream fis = new FileInputStream("dedalus.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee emp = (Employee)ois.readObject();
			System.out.println("DeSerilized from file dedalus.txt");
			System.out.println(emp.getEmpno());
			System.out.println(emp.getEname());
			ois.close();
			fis.close();
			}
			catch(FileNotFoundException fnf)
			{
				System.out.println("No file");
			}
			catch(ClassNotFoundException cnf)
			{
				System.out.println("No Emp class");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

				
		
	

}