public class PromoPrice extends Price {

	private LocalDate endDate;

	public LocalDate getEndDate() {
		return this.endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public PromoPrice() {
		// TODO - implement PromoPrice.PromoPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 * @param effectiveDate
	 * @param endDate
	 */
	public PromoPrice(String price, String effectiveDate, String endDate) {
		// TODO - implement PromoPrice.PromoPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public Boolean isEffective(LocalDate date) {
		// TODO - implement PromoPrice.isEffective
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 */
	public void compareTo(Price price) {
		// TODO - implement PromoPrice.compareTo
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement PromoPrice.toString
		throw new UnsupportedOperationException();
	}

}