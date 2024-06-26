package com.flipkart.collection;
import java.util.*;
public class ArrayListDemo {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        // define the List with Array List Impl 
	        
	        List<String> list =new ArrayList<String>();
	        
	        // size of collection ! 
	        
	        System.out.println("complete Size of Collection-->" +list.size());
	        
	        
	        // add the element in colection 
	        
	        // Add 
	        list.add("mumbai");
	        list.add("MALE");
	        list.add("NEw YoRK");
	        list.add("mumbai");
	        list.add("channai");
	        list.add("Blore");
	        
	        
	        System.out.println("complete Size of  final Collection-->" +list.size());
	        
	        
	        // Remove  by index & by name 
	        
	        list.remove("MALE");
	        
	        list.remove(3);
	        
	        System.out.println("complete Size of  Collection after removal-->" +list.size());
	        
	        
	        // List of collection printing :--> 
	        
	        // there are two ways we can use it
	        
	        //old way
	        Iterator<String> i=list.iterator();
	        while(i.hasNext()) {
	            
	              String test=i.next();
	              System.out.println("list of collection-->" +test);
	            
	        }
	        
	        // morden way to put the details 
	        
	        for(String value: list) {
	            
	            System.out.println("Element:--" +value);
	        }
	        
	            

	    }
}
