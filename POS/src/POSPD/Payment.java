/**
 * This is the exchange of money for the items in the sale.  It is usually cash, check or credit card.
 */
public abstract class Payment {

	private BigDecimal amount;
	private BigDecimal amtTendered;

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmtTendered() {
		return this.amtTendered;
	}

	public void setAmtTendered(BigDecimal amtTendered) {
		this.amtTendered = amtTendered;
	}

	public BigDecimal calcChange() {
		// TODO - implement Payment.calcChange
		throw new UnsupportedOperationException();
	}

	public Boolean hasCash() {
		// TODO - implement Payment.hasCash
		throw new UnsupportedOperationException();
	}

}