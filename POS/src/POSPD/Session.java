import java.util.*;

public class Session {

	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime;
	private Register register;
	private Cashier cashier;
	private Collection<Sale> sales;

	public LocalDateTime getStartDateTime() {
		return this.startDateTime;
	}

	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public LocalDateTime getEndDateTime() {
		return this.endDateTime;
	}

	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}

	public Register getRegister() {
		return this.register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public Cashier getCashier() {
		return this.cashier;
	}

	public void setCashier(Cashier cashier) {
		this.cashier = cashier;
	}

	public Collection<Sale> getSales() {
		return this.sales;
	}

	public void setSales(Collection<Sale> sales) {
		this.sales = sales;
	}

	/**
	 * 
	 * @param cashier
	 * @param register
	 */
	public Session(Cashier cashier, register register) {
		// TODO - implement Session.Session
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sale
	 */
	public void addSale(Sale sale) {
		// TODO - implement Session.addSale
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sale
	 */
	public void removeSale(Sale sale) {
		// TODO - implement Session.removeSale
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cash
	 */
	public BigDecimal calcCashCountDiff(BigDecimal cash) {
		// TODO - implement Session.calcCashCountDiff
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Session.toString
		throw new UnsupportedOperationException();
	}

}