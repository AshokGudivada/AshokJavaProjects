import java.util.*;

public class Sale {

	private Calendar dateTime;
	private Boolean taxFree;
	private Collection<Payment> payments;
	private Collection<SaleLineItem> saleLineItems;

	public Calendar getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}

	public Boolean getTaxFree() {
		return this.taxFree;
	}

	public void setTaxFree(Boolean taxFree) {
		this.taxFree = taxFree;
	}

	public Sale() {
		// TODO - implement Sale.Sale
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taxFree
	 */
	public Sale(String taxFree) {
		// TODO - implement Sale.Sale
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dateTime
	 * @param taxFree
	 */

	/**
	 * 
	 * @param payment
	 */
	public void addPayment(Payment payment) {
		// TODO - implement Sale.addPayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param payment
	 */
	public void removePayment(Payment payment) {
		// TODO - implement Sale.removePayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sli
	 */
	public void addSaleLineItem(SaleLineItem sli) {
		// TODO - implement Sale.addSaleLineItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sli
	 */
	public void removeSaleLineItem(SaleLineItem sli) {
		// TODO - implement Sale.removeSaleLineItem
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcTotal() {
		// TODO - implement Sale.calcTotal
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcSubTotal() {
		// TODO - implement Sale.calcSubTotal
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcTax() {
		// TODO - implement Sale.calcTax
		throw new UnsupportedOperationException();
	}

	public BigDecimal getTotalPayment() {
		// TODO - implement Sale.getTotalPayment
		throw new UnsupportedOperationException();
	}

	public boolean isPaymentEnough() {
		// TODO - implement Sale.isPaymentEnough
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcChange() {
		// TODO - implement Sale.calcChange
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcAmtTendered() {
		// TODO - implement Sale.calcAmtTendered
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Sale.toString
		throw new UnsupportedOperationException();
	}

}