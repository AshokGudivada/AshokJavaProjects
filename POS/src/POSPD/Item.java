import java.util.*;

/**
 * A good that is available for sale in the store.  It usually has a number called an item number or SKU.  It also has UPCs.
 */
public class Item {

	private TaxCategory taxCategory;
	private Collection<Price> prices;
	private Collection<UPC> uPCs;
	private String number;
	private String description;
	private Collection<SaleLineItem> saleLineItems;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Item() {
		// TODO - implement Item.Item
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 * @param description
	 */
	public Item(String number, String description) {
		// TODO - implement Item.Item
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 */
	public void addPrice(Price price) {
		// TODO - implement Item.addPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 */
	public void removePrice(Price price) {
		// TODO - implement Item.removePrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param upc
	 */
	public void addUPC(UPC upc) {
		// TODO - implement Item.addUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param upc
	 */
	public void removeUPC(UPC upc) {
		// TODO - implement Item.removeUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public BigDecimal getPriceForDate(Date date) {
		// TODO - implement Item.getPriceForDate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public BigDecimal getTaxRateForDate(Date date) {
		// TODO - implement Item.getTaxRateForDate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param quantity
	 */
	public BigDecimal calcSubTotalForDate(int quantity) {
		// TODO - implement Item.calcSubTotalForDate
		throw new UnsupportedOperationException();
	}

}