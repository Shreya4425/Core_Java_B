package com.TNS.day7.abstraction;

public class Rectangle extends Shape
{
    private float width, height;

    public Rectangle() {
    	this.width = 4.0f;
    	this.height = 5.4f;
    }
    
    
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	@Override //overriding the method (shape) inside a subclass (rectangle)
	void calArea () {
		area = width*height; 
	}
}
