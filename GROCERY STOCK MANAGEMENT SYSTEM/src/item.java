import java.util.GregorianCalendar;

/**
 * 
 */

/**
 * @author Xing Chen
 *
 */
class item {

	private String itemName;
	private double cost;
	private double salePrice;
	private double MSRP;
	private GregorianCalendar expirationDate;
	
	
	private item(){
		itemName = "";
		cost = 00.00;	
		salePrice = 00.00;
		MSRP = 00.00;
		expirationDate = new GregorianCalendar(2016,12,31);
	}
	
	private item(String newItemName, double newCost, double newSalePrice, double newMSRP, int year, int month, int date){
		this.itemName = newItemName;
		this.cost = newCost;
		this.salePrice = newSalePrice;
		this.MSRP = newMSRP;
		this.expirationDate = new GregorianCalendar(year, month, date);
		
	}
}
