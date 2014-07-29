package com.spring.test;

/**
 * ConcrateDefines a Data Access Object - a non data source specific
 * way of obtaining data.
 * 
 * @author Paul Browne - www.firstpartners.net
 */ 
public class DaoImplementation implements StockNameDao {

	/**
	 * Constructor with package level access only 
	 * to encourage use of factory method
	 *
	 */
	DaoImplementation(){
		
	}
	
	/**
	 * Get a list of stock names that the application can deal with.
	 * This is a hard coded sample - normally we would get this from
	 * a database or other datasource.
	 * @return String[] array of stock names
	 */
	public String[] getStockNames() {

		String[] stockNames={"XYZ","ABC","MEGACORP","SOMEOTHERCOMPANY"};
		
		return stockNames;
	}
	
	/**
	 * Check if our stock is on the list of ones we deal with
	 * @param stockName
	 * @return true if this is on of the stocks we deal with
	 */
	public boolean isOnStockList(String stockName){
		
		//Get our list of stocks		
		String stockList[] = getStockNames();
		
		//Loop and see if our stock is on it
		// done this way for clarity . not speed!
		for (int a=0; a<stockList.length;a++){
			if(stockList[a].equals(stockName)){
				return true;
			}
		}
		
		//Default returh value
		return false;	
	}

}
