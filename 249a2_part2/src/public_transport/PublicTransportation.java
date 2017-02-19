// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

package public_transport;

/**
 * Public Transportation class from which all other classes are derived
 * @author Anne Ehresmann
 * @author Seth Cole
 * @version 1.0
 * 
 */
public class PublicTransportation {


private double ticketPrice;

private int stopsNum;

// Constructors
/**
 * Default Constructor
 */
public PublicTransportation(){
	ticketPrice = 0;
	stopsNum = 0;
}

/**
 * Parameterized constructor
 * @param newTicketPrice Ticket price of type double
 * @param newStopsNum Number of stops of type int
 */
public PublicTransportation(double newTicketPrice, int newStopsNum){
	ticketPrice = newTicketPrice;
	stopsNum = newStopsNum;
}

/**
 * Copy constructor
 * @param obj An object of type PublicTransportation
 */
public PublicTransportation(PublicTransportation obj){
	ticketPrice = obj.ticketPrice;
	stopsNum = obj.stopsNum;
}


// Setters and Getters

/**
 * Sets ticket price
 * @param newTicketPrice Ticket price of type double
 */
public void setTicketPrice(double newTicketPrice){
	ticketPrice = newTicketPrice;
}
/**
 * Gets ticket price
 * @return Ticket price of type double
 */
public double getTicketPrice(){
	return ticketPrice;
}

/**
 * Sets number of stops
 * @param newStopsNum Number of stops of type int
 */
public void setStopsNum(int newStopsNum){
	stopsNum = newStopsNum;
}
/**
 * Gets number of stops
 * @return Number of stops of type int
 */
public int getStopsNum(){
	return stopsNum;
}

// ToString and Equals
/**
 * toString method
 * @return This objects attributes in a readable format of type String
 */
public String toString(){
	return "I am an object of type " + getClass().getSimpleName() + ".\nTicket Price: " + ticketPrice + "$\nNumber of Stops: " + stopsNum;
}

/**
 * Equals method 
 */
public boolean equals(Object obj){
	// checks if the other object is null. If so, check if the objects are of the same class. If so, cast to that class, and check each individual attribute. This should prevent any crashing.
	if (obj != null && obj.getClass() == getClass()) {
		PublicTransportation pbobj = (PublicTransportation) obj;
		return (
			pbobj.ticketPrice == this.ticketPrice &&
			pbobj.stopsNum == this.stopsNum
			);
	}
	else{return false;}
}
}
