
package com.dedalus;

 class First{
	
	int x=20;//here this is the constant
	static int y=30; // this one increments and store the memory in location
	
	public static void staticMethod() {
		System.out.println(++y);    //y=y+1
	}

	public void regularMethod() {
		System.out.println(++x);
		System.out.println(++y);
	}
}


public class StaticEx {	

	public static void main(String[] args) {
//		First.staticMethod();
//		First.staticMethod();
		First.staticMethod();
		//StaticEg s1 = new StaticEg();
		//StaticEg s2 = new StaticEg();
		First s1 = new First();
		First s2 = new First();
		s1.regularMethod();
		s2.regularMethod();
	}

}