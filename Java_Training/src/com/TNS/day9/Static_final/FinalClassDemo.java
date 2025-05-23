package com.TNS.day9.Static_final;

//final cannot be inherited

final class FinalClassDemo {
	
	void show() {
		System.out.println("final class cannot be inherited");
	}
	
	final class final3 extends FinalClassDemo {
		
	 //final classes cannot be inherited...
	//	remove the final keyword and check
		
		
	}

}