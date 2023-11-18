package com.example.daythree;

import java.io.*;


public class InstanceVariables {
	
	 // Declared Instance Variable
    public String greek;
    public int i;
    public Integer I;
    public InstanceVariables()
    {
        // Default Constructor
        // initializing Instance Variable
        this.greek = "Shubham Jain";
    }
 

	public static void main(String[] args) {
		
		InstanceVariables name = new InstanceVariables();
		 
	        // Displaying O/P
	        System.out.println("Greek name is: " + name.greek);
	        System.out.println("Default value for int is "
	                           + name.i);
	       
	        // toString() called internally
	        System.out.println("Default value for Integer is "
	                           + name.I);
		

	}

}
