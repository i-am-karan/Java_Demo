/**
 * 
 */
package com.flipkart.io;

/**
 * 
 */
import java.util.*;
public class ScannerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("--------Enter Your Details-------- ");  
          Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");    
          String name = in.next();   
          System.out.println("Name: " + name);           
          System.out.print("Enter your age: ");  
          int i = in.nextInt();  
          System.out.println("Age: " + i);  
          System.out.print("Enter your salary: ");  
          double d = in.nextDouble();  
          System.out.println("Salary: " + d);         
          in.close();           
	}

}
