
package com.spring.test;

import junit.framework.TestCase;

/**
 * Test of the Stock Dao (or more accurately it's implementation in 
 * DaoImplmenetation
 * 
 * @author Paul Browne - www.firstpartners.net
 */
public class StockDaoTest extends TestCase {

	public void testIsOnStockList(){
		
		StockNameDao myDao = DaoFactory.getStockDao();
		assertTrue(myDao.isOnStockList("XYZ"));
				
	}
}
