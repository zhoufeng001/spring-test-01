package com.spring.test;

/**
 * Factory Method to get the Data Access Object we require.
 * Normally we could replace this with a framework like
 * Spring or Hibernate 
 * 
 * @author Paul Browne - www.firstpartners.net
 */
public class DaoFactory {

	/**
	 * Get the stock name Dao
	 * This sample is hardcded - in reality we would make
	 * this configurable / cache instances of the Dao as appropriate
	 * @return an instance of StockNameDao
	 */
	public static StockNameDao getStockDao(){
		
		return new DaoImplementation();
	}
}
