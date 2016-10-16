import java.util.*;

/**
 * class to define diff Tax Category
 */
public class TaxCategory {

	private Collection<TaxRate> taxRates;
	/**
	 * name of tax category
	 */
	private String category;

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public TaxCategory() {
		// TODO - implement TaxCategory.TaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param category
	 */
	public TaxCategory(String category) {
		// TODO - implement TaxCategory.TaxCategory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public void getTaxRateForEffectiveDate(LocalDate date) {
		// TODO - implement TaxCategory.getTaxRateForEffectiveDate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taxRate
	 */
	public void removeTaxRate(TaxRate taxRate) {
		// TODO - implement TaxCategory.removeTaxRate
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement TaxCategory.toString
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param taxRate
	 */
	public void addTaxRate(TaxRate taxRate) {
		// TODO - implement TaxCategory.addTaxRate
		throw new UnsupportedOperationException();
	}

}