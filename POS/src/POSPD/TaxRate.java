/**
 * Tax Rate
 */
public class TaxRate {

	private BigDecimal taxRate;
	private LocalDate effectiveDate;

	public BigDecimal getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	public LocalDate getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
	 * 
	 * @param date
	 */
	public void isEffective(LocalDate date) {
		// TODO - implement TaxRate.isEffective
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taxRate
	 */
	public void compareTo(TaxRate taxRate) {
		// TODO - implement TaxRate.compareTo
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement TaxRate.toString
		throw new UnsupportedOperationException();
	}

}