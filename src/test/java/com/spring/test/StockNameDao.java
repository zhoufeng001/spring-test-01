
package com.spring.test;

/**
 * Defines a Data Access Object - a non data source specific
 * way of obtaining data.
 * 
 * @author Paul Browne - www.firstpartners.net
 */ 
public interface StockNameDao {

	/**
	 * Get a list of stock names that the application can deal with
	 * @return String[] array of stock names
	 */
	public String [] getStockNames();
	
	/**
	 * Check if our stock is on the list of ones we deal with
	 * @param stockName
	 * @return
	 */
	public boolean isOnStockList(String stockName);
	
	
}
