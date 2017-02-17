// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

package public_transport;

public class PublicTransportation {

private double ticketPrice;
private int stopsNum;

// Constructors
public PublicTransportation(){
	ticketPrice = 0;
	stopsNum = 0;
}

public PublicTransportation(double newTicketPrice, int newStopsNum){
	ticketPrice = newTicketPrice;
	stopsNum = newStopsNum;
}

public PublicTransportation(PublicTransportation obj){
	ticketPrice = obj.ticketPrice;
	stopsNum = obj.stopsNum;
}


// Setters and Getters

public void setTicketPrice(double newTicketPrice){
	ticketPrice = newTicketPrice;
}
public double getTicketPrice(){
	return ticketPrice;
}

public void setStopsNum(int newStopsNum){
	stopsNum = newStopsNum;
}
public int getStopsNum(){
	return stopsNum;
}

// ToString and Equals
public String toString(){
	return "I am an object of type " + getClass().getSimpleName() + ".\nTicket Price: " + ticketPrice + "$\nNumber of Stops: " + stopsNum;
}

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
