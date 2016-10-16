public class Price {

	private Item item;
	private BigDecimal price;
	private LocalDate effectiveData;

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDate getEffectiveData() {
		return this.effectiveData;
	}

	public void setEffectiveData(LocalDate effectiveData) {
		this.effectiveData = effectiveData;
	}

	public Price() {
		// TODO - implement Price.Price
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 * @param effectiveDate
	 */
	public Price(String price, String effectiveDate) {
		// TODO - implement Price.Price
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public Boolean isEffective(LocalDate date) {
		// TODO - implement Price.isEffective
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 */
	public void compareTo(Price price) {
		// TODO - implement Price.compareTo
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Price.toString
		throw new UnsupportedOperationException();
	}

}