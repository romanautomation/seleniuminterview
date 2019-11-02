package javalearning;

import org.osgl.Osgl.F3;



public class NormalClass3 extends NormalClass2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        f2();
        
//        NormalClass2 nm = new NormalClass2();
//        nm.f3();
        
//        NormalClass3 nm2 = new NormalClass3(); //compile time polymorphism - method overloading
//        nm2.f3();
//        nm2.f4();
        
        NormalClass2 nm3 = new NormalClass3(); //run time polymorphism - method overriding
        nm3.f3();
        
	}

	
	public void f4(){
		System.out.println("f4 method");
	}
}
