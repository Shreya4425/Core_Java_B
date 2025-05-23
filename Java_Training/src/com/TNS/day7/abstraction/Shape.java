package com.TNS.day7.abstraction;

public abstract class Shape 
{
 protected float area;
 abstract void calArea();

 void show()//non abstract method
 {
    	System.out.println("The area is :"+area);
 }

}
