import java.util.*;

/**
 * A store employee who makes a sale to a customer by determining the price total of all products sold and taking payment from the customer.
 */
public class Cashier {

	private String number;
	private String password;
	private Collection<Session> sessions;
	private Person person;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Cashier() {
		// TODO - implement Cashier.Cashier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 * @param person
	 * @param password
	 */
	public Cashier(String number, Person person, String password) {
		// TODO - implement Cashier.Cashier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param session
	 */
	public void addSession(Session session) {
		// TODO - implement Cashier.addSession
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param session
	 */
	public void removeSession(Session session) {
		// TODO - implement Cashier.removeSession
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param password
	 */
	public Boolean isAuthorized(int password) {
		// TODO - implement Cashier.isAuthorized
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Cashier.toString
		throw new UnsupportedOperationException();
	}

}