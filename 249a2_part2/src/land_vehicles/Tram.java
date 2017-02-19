// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

package land_vehicles;

import public_transport.*;

/**
 * A Tram class extending the CityBus class with the additional attribute MaximumSpeed
 * @author Anne Ehresmann
 * @author Seth Cole
 * @version 1.0
 * @see CityBus
 * @see PublicTransportation
 */
public class Tram extends CityBus {

private int maximumSpeed;



// Constructors
/**
 * Default constructor
 */
public Tram(){
	super();
	maximumSpeed = 0;
}

/**
 * Parameterized constructor
 * @param newTicketPrice Ticket price of type double
 * @param newStopsNum Number of stops of type int
 * @param newRouteNumber Route number of type long
 * @param newBeginOperationYear First year of operation of type int
 * @param newLineLane Line lane of type String
 * @param newDriverName Name of the driver of type String
 * @param newMaximumSpeed Maximum speed the vehicle can go of type int
 */
public Tram(double newTicketPrice, int newStopsNum, long newRouteNumber, int newBeginOperationYear, String newLineLane, String newDriverName, int newMaximumSpeed){
	super(newTicketPrice, newStopsNum, newRouteNumber, newBeginOperationYear, newLineLane, newDriverName);
	maximumSpeed = newMaximumSpeed;
}

/**
 * Copy constructor
 * @param obj An object of type tram
 */
public Tram(Tram obj){
	super((CityBus) obj);
	maximumSpeed = obj.maximumSpeed;
}


// Setters and Getters

/**
 * Sets maximum speed
 * @param newMaximumSpeed Maximum speed of type int
 */
public void setMaximumSpeed(int newMaximumSpeed){
	maximumSpeed = maximumSpeed;
}
/**
 * gets maximum speed
 * @return returns maximum speed of type int
 */
public int getMaximumSpeed(){
	return maximumSpeed;
}

// toString and equals
/**
 * toString method
 * @return This objects attributes in a readable format of type String
 */
public String toString(){
	return super.toString() + "\nMaximum Speed: " + maximumSpeed +"km/h";
}
/**
 * Equals method 
 */
public boolean equals(Object obj){
	// uses the parent equals to check if the other object is null, and then check if the objects are of the same class. If so, cast to that class, and check each individual attribute. This should prevent any crashing.
	if(super.equals(obj)) {
		Tram tramobj = (Tram) obj;
		return (tramobj.maximumSpeed == this.maximumSpeed);
	}
	else{return false;}
}
}
