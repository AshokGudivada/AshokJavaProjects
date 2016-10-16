import java.util.*;

/**
 * A location where managers and cashiers work to sell item to customers.
 */
public class Store {

	/**
	 * Store Number
	 */
	private String number = 1;
	/**
	 * Name of store
	 */
	private String name;
	/**
	 * A store employee who makes a sale to a customer by determining the price total of all products sold and taking payment from the customer.
	 */
	private Collection<Cashier> cashiers;
	/**
	 * A Universe Product Code is a number that is assigned to an item.
	 */
	private UPC uPCs;
	/**
	 * define diff Tax Category
	 */
	private Collection<TaxCategory> taxCategories;
	private Collection<Register> registers;
	private Collection<Item> items;
	private Collection<Session> sessions;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Cashier> getCashiers() {
		return this.cashiers;
	}

	public UPC getUPCs() {
		return this.uPCs;
	}

	public void setUPCs(UPC uPCs) {
		this.uPCs = uPCs;
	}

	public Collection<TaxCategory> getTaxCategories() {
		return this.taxCategories;
	}

	public void setTaxCategories(Collection<TaxCategory> taxCategories) {
		this.taxCategories = taxCategories;
	}

	public Collection<Register> getRegisters() {
		return this.registers;
	}

	public void setRegisters(Collection<Register> registers) {
		this.registers = registers;
	}

	public Collection<Item> getItems() {
		return this.items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}

	public Collection<Session> getSessions() {
		return this.sessions;
	}

	public void setSessions(Collection<Session> sessions) {
		this.sessions = sessions;
	}

	/**
	 * Construtor
	 */
	public Store() {
		// TODO - implement Store.Store
		throw new UnsupportedOperationException();
	}

	/**
	 * Construtor with store number and name of the store
	 * @param number
	 * @param name
	 */
	public Store(String number, String name) {
		// TODO - implement Store.Store
		throw new UnsupportedOperationException();
	}

	/**
	 * add item to store
	 * @param item
	 */
	public void add(Item item) {
		// TODO - implement Store.add
		throw new UnsupportedOperationException();
	}

	/**
	 * removes item from  store
	 * @param item
	 */
	public void removeItem(Item item) {
		// TODO - implement Store.removeItem
		throw new UnsupportedOperationException();
	}

	/**
	 * add UPC Code
	 * @param upc
	 */
	public void addUPC(UPC upc) {
		// TODO - implement Store.addUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * remove the UPC Code
	 * @param upc
	 */
	public void removeUPC(UPC upc) {
		// TODO - implement Store.removeUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * adds reg to store
	 * @param register
	 */
	public void addRegister(Register register) {
		// TODO - implement Store.addRegister
		throw new UnsupportedOperationException();
	}

	/**
	 * removes reg from the store
	 * @param register
	 */
	public void removeRegister(Register register) {
		// TODO - implement Store.removeRegister
		throw new UnsupportedOperationException();
	}

	/**
	 * add cashier to store
	 * @param cashier
	 */
	public void addCashier(Cashier cashier) {
		// TODO - implement Store.addCashier
		throw new UnsupportedOperationException();
	}

	/**
	 * remove cashier from the store
	 * @param cashier
	 */
	public void removeCashier(Cashier cashier) {
		// TODO - implement Store.removeCashier
		throw new UnsupportedOperationException();
	}

	/**
	 * starts session
	 * @param sessions
	 */
	public void addSession(Session sessions) {
		// TODO - implement Store.addSession
		throw new UnsupportedOperationException();
	}

	/**
	 * stop the session
	 * @param session
	 */
	public void removeSession(Session session) {
		// TODO - implement Store.removeSession
		throw new UnsupportedOperationException();
	}

	/**
	 * find Item For UPC in store
	 * @param upc
	 */
	public Item findItemForUPC(String upc) {
		// TODO - implement Store.findItemForUPC
		throw new UnsupportedOperationException();
	}

	/**
	 * find Cashier with cashier number
	 * @param number
	 */
	public Cashier findCashierForNumber(String number) {

	}

	public String toString() {
		// TODO - implement Store.toString
		throw new UnsupportedOperationException();
	}

}