package groceryManagement;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * 
 */

/**
 * @author Xing Chen
 *
 */
public class item {

	private String itemName;
	private double cost;
	private double salePrice;
	private double MSRP;
	private GregorianCalendar expirationDate;
	
	
	item(){
		setItemName("Item");
		setCost(00.00);	
		setSalePrice(00.00);
		setMSRP(00.00);
		setExpirationDate(new GregorianCalendar(2016,11,31));
	}
	
	public item(String newItemName, double newCost, double newSalePrice, double newMSRP, int year, int month, int date){
		this.setItemName(newItemName);
		this.setCost(newCost);
		this.setSalePrice(newSalePrice);
		this.setMSRP(newMSRP);
		this.setExpirationDate(new GregorianCalendar(year, month, date));
		
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public double getMSRP() {
		return MSRP;
	}

	public void setMSRP(double mSRP) {
		MSRP = mSRP;
	}

	public GregorianCalendar getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(GregorianCalendar expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public String toString(){
	
		return this.itemName + " " + this.cost + " " + this.MSRP + " "  + sdf.format(this.expirationDate.getTime());
	
	}
	
	//formatting date 
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
}