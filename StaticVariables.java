package com.example.daythree;


public class StaticVariables {
	
	 public static String geek = "Shubham Jain";
	   
	    public static void main(String[] args)
	    {
	 
	        // greek variable can be accessed without object
	        // creation Displaying O/P GFG.geek --> using the
	        // static variable
	        System.out.println("Greek Name is : " + StaticVariables.geek);
	 
	        // static int c=0;
	        // above line,when uncommented,
	        // will throw an error as static variables cannot be
	        // declared locally.
	    }

}
