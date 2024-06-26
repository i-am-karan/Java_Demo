/**
 * 
 */
package com.flipkart.client;
import com.flipkart.business.CustomerBusiness;
import com.flipkart.business.CustomerInterface;

/**
 * 
 */
public class CustomerClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerInterface service=new CustomerBusiness();
		service.createCustomer();
		System.out.println("update customer "+service.updateCustomer(106));
		System.out.println("Delete Customer "+service.deleteCustomer(101));
		service.listCustomer();
		
	}

}
