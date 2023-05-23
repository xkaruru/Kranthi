package com.dedalus;

public class MainClass {
	
	int x;
	int y;

	public String Method1(String firstName,String secondName) {
		String FullName=firstName+secondName;
		return FullName;
		
	}
	
	public  int add(int a , int b) {
	   int x = a+b;
		return x;
		
	}
	public  int substract(int a , int b) {
	   int x = a-b;
		return x;
		
	}

	public static void main(String[] args) {
		
		MainClass firstmethod=new MainClass();
		
		System.out.println(firstmethod.Method1("This is the kranthi"," First Project"));
		
		MainClass secondmethod =new MainClass();
		System.out.println(" The sum of Two Digits  is "+secondmethod.add(10, 20));
		
		MainClass Thirdmethod=new MainClass();
		System.out.println(" The sum of Two Digits  is "+Thirdmethod.substract(30, 20));
		
	  
		

	}

}
 

	 
 
 

