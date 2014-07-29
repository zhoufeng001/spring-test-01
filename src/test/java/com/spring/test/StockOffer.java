package com.spring.test;

/**
 * Simple JavaBean to hold StockOffer values.
 * A 'Stock offer' is an offer (from somebody else)
 * to sell us a Stock (or Company share).
 * 
 * @author Paul Browne - www.firstpartners.net
 */
public class StockOffer {
	
	//constants
	public final static String YES="YES";
	public final static String NO="NO";
	
	//Internal Variables
	private String stockName =null;
	private int stockPrice=0;
	private int stockQuantity=0;
	private String recommendPurchase = null;
	
	/**
	 * @return Returns the stockName.
	 */
	public String getStockName() {
		return stockName;
	}
	/**
	 * @param stockName The stockName to set.
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	/**
	 * @return Returns the stockPrice.
	 */
	public int getStockPrice() {
		return stockPrice;
	}
	/**
	 * @param stockPrice The stockPrice to set.
	 */
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
	/**
	 * @return Returns the stockQuantity.
	 */
	public int getStockQuantity() {
		return stockQuantity;
	}
	/**
	 * @param stockQuantity The stockQuantity to set.
	 */
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	/**
	 * @return Returns the recommendPurchase.
	 */
	public String getRecommendPurchase() {
		return recommendPurchase;
	}
	/**
	 * @param recommendPurchase The recommendPurchase to set.
	 */
	public void setRecommendPurchase(String recommendPurchase) {
		this.recommendPurchase = recommendPurchase;
	}
}
