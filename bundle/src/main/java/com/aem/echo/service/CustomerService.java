package com.aem.echo.service;

public interface CustomerService {

	// Stores customer data in the Adobe CQ JCR
	public int injestCustomerData(String firstName, String lastName, String phone, String desc);

	/*
	 * Retrieves customer data from the AEM JCR and returns all customer data within
	 * an XML schema The filter argument specifies one of the following values:
	 * 
	 * Customer - retrieves all customer data Active Customer- retrieves current
	 * customers from the JCR Past Customer - retrieves old customers no longer
	 * current customers
	 */
	public String getCustomerData(String filter);
}
