package com.dedalus;


interface function1 {
	
	void method1();
}

interface function2 extends function1{
	
	void method2();
}
class function implements function1,function2 {

	@Override
	public void method1() {
		System.out.println("Method calling from First interface");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method calling from second interface");
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		function1 f1=new function();
		f1.method1();
		function1 f2=new function();
		f2.method1();

	}

}
