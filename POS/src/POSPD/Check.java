public class Check extends AuthorizedPayment {

	private String routinngNumber;
	private String accountNumber;
	private String checkNumber;

	public String getRoutinngNumber() {
		return this.routinngNumber;
	}

	public void setRoutinngNumber(String routinngNumber) {
		this.routinngNumber = routinngNumber;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCheckNumber() {
		return this.checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public Check() {
		// TODO - implement Check.Check
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 * @param accountNumber
	 */
	public Check(String amount, String accountNumber) {
		// TODO - implement Check.Check
		throw new UnsupportedOperationException();
	}

	public Boolean isAuthorized() {
		// TODO - implement Check.isAuthorized
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcChange() {
		// TODO - implement Check.calcChange
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Check.toString
		throw new UnsupportedOperationException();
	}

}