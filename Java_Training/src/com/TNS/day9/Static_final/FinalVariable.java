package com.TNS.day9.Static_final;

public class FinalVariable {
	
	final int x=100;//required
	final static int y;//declared blank and cannot be initialized
	final static int z=100; //initialization
	
	void change() {
		x=30;//error ..once initiasied cannot be changed
		y=44;
			
	}
	
	
	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", y" + y+ "]";
	}
	
	static{
		
		y=22;
		z=33; //once initialised cannot be reassigned
		System.out.println("value of y is "+y);
		
	}

	
}