/**
 * 
 */
package com.flipkart.business;

/**
 * 
 */
public interface CustomerInterface {
	public void createCustomer();
	public boolean updateCustomer(int customerId) ;
	public boolean deleteCustomer(int customerId) ;
	public void listCustomer();
}
