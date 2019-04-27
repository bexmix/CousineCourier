/**
 * Delivery is the physical order in the real world when it is sent to a driver.
 */

package store;

import user.Address;

public class Delivery {

	enum Status
	{
		TO_STORE, ORDERING, TO_DEST, 
		DELIVERED, NONE
	}
	Order order;
	Address storeAddress;
	Address destination;
	Status status;
	int deliveryId;
	
	public Delivery() {
		order = new Order();
		storeAddress = new Address();
		destination = new Address();
	}
	
	public Delivery(Order order, Address storeAddress, Address destination, Status status)
	{
		this.order = order;
		this.storeAddress = storeAddress;
		this.destination = destination;
		this.status = status;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the storeAddress
	 */
	public Address getStoreAddress() {
		return storeAddress;
	}

	/**
	 * @param storeAddress the storeAddress to set
	 */
	public void setStoreAddress(Address storeAddress) {
		this.storeAddress = storeAddress;
	}

	/**
	 * @return the destination
	 */
	public Address getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Address destination) {
		this.destination = destination;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void setDeliveryId(int id) {
		deliveryId = id;
	}
	
	public int getDeliveryId() {
		return deliveryId;
	}
	
	
}
