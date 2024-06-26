/**
 * 
 */
package com.flipkart.business;

import com.flipkart.bean.Customer;

/**
 * 
 */
public class CustomerBusiness implements CustomerInterface{
	//add //update //delete  //list
	
//    
    Customer customer[]=new Customer[3];
    
    
    public void createCustomer() {
        
        System.out.println("Customer Created-->");
        
        // Add first record 
        
        customer[0] = new Customer();
        customer[0].setCustomerId(101);
        customer[0].setCustomerName("amy");
        customer[0].setCustomerAddress("Blore");
        
        // Second Record 
        customer[1] = new Customer();
        customer[1].setCustomerId(102);
        customer[1].setCustomerName("heena");
        customer[1].setCustomerAddress("Delhi");
        
        // third Record
        
        customer[2] = new Customer();
        customer[2].setCustomerId(103);
        customer[2].setCustomerName("Amrit");
        customer[2].setCustomerAddress("Blore");
        
         
    }
    
    public boolean updateCustomer(int customerId) {
        for(int i=0;i<3;i++) {
        	if(customer[i].getCustomerId()==customerId) {
        		 System.out.println("Customer is updated by id -->" +customerId);
        		 //update the given details if given
        	     return true;	
        	}
        }
        System.out.println("CustomerId " +customerId+" not updated");
        return false;
    }
   
   
   public boolean deleteCustomer(int customerID) {
  
	   for(int i=0;i<3;i++) {
       	if(customer[i].getCustomerId()==customerID) {
       		 System.out.println("Customer is deleted Successfully by id -->" +customerID);
       		 // delete the customer 
       	     return true;	
       	}
       }
       System.out.println("CustomerId " +customerID+" not deleted");
       return false;
   }

   
   public void listCustomer() {
       
       System.out.println("customer display over here --->");
       
       for(Customer customer: customer) {
           
           System.out.println("Details of customer-->" +customer.getCustomerId() + "--" +customer.getCustomerName() + "-" +customer.getCustomerAddress());
       }
   }
}
