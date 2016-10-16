public class Credit extends AuthorizedPayment {

	private String cardType;
	private String acctNumber;
	private Calendar expiresDate;

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getAcctNumber() {
		return this.acctNumber;
	}

	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public Calendar getExpiresDate() {
		return this.expiresDate;
	}

	public void setExpiresDate(Calendar expiresDate) {
		this.expiresDate = expiresDate;
	}

	public Credit() {
		// TODO - implement Credit.Credit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 * @param accountNumber
	 */
	public Credit(String amount, String accountNumber) {
		// TODO - implement Credit.Credit
		throw new UnsupportedOperationException();
	}

	public Boolean isAuthorized() {
		// TODO - implement Credit.isAuthorized
		throw new UnsupportedOperationException();
	}

	public BigDecimal calcChange() {
		// TODO - implement Credit.calcChange
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Credit.toString
		throw new UnsupportedOperationException();
	}

}