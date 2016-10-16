public class AuthorizedPayment extends Payment {

	private String authorizationCode;

	public String getAuthorizationCode() {
		return this.authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public Boolean isAuthorization() {
		// TODO - implement AuthorizedPayment.isAuthorization
		throw new UnsupportedOperationException();
	}

	public Boolean hasCash() {
		// TODO - implement AuthorizedPayment.hasCash
		throw new UnsupportedOperationException();
	}

}