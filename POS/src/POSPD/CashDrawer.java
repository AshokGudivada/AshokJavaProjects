public class CashDrawer {

	private Register cashDrawer;
	private BigDecimal cashAmount;
	private int position;

	public BigDecimal getCashAmount() {
		return this.cashAmount;
	}

	public void setCashAmount(BigDecimal cashAmount) {
		this.cashAmount = cashAmount;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * 
	 * @param cash
	 */
	public void addCash(BigDecimal cash) {
		// TODO - implement CashDrawer.addCash
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cash
	 */
	public void removeCash(BigDecimal cash) {
		// TODO - implement CashDrawer.removeCash
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement CashDrawer.toString
		throw new UnsupportedOperationException();
	}

}