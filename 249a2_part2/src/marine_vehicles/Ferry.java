// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

package marine_vehicles;
import public_transport.*;
/** 
 * A Ferry class which extends the PublicTransportation class with additional parameters
 * @author Anne Ehresmann
 * @author Seth Cole
 * @version 1.0
 * @see PublicTransportation
 */

public class Ferry extends PublicTransportation {
private int buildYear;
private String shipName;

// Constructors

/**
 * Default constructor
 */
public Ferry(){
	super();
	buildYear = 0;
	shipName = "";
}

/**
 * Parameterized constructor
 * @param newTicketPrice Ticket price of type double
 * @param newStopsNum Number of stops of type int
 * @param newBuildYear Year built of type int
 * @param newShipName Name of the ship of type String
 */
public Ferry(double newTicketPrice, int newStopsNum,int newBuildYear, String newShipName){
	super(newTicketPrice, newStopsNum);
	buildYear = newBuildYear;
	shipName = newShipName;
}

/**
 * Copy constructor
 * @param obj An object of type Ferry
 */
public Ferry(Ferry obj){
	super((PublicTransportation) obj);
	buildYear = obj.buildYear;
	shipName = obj.shipName;
}

// Setters and Getters

/**
 * Sets build year
 * @param newBuildYear Year built of type int
 */
public void setBuildYear(int newBuildYear){
	buildYear = newBuildYear;
}

/**
 * Gets build year
 * @return year built of type int
 */
public int getBuildYear(){
	return buildYear;
}

/**
 * Sets ship name
 * @param newShipName Name of the ship of type String
 */
public void setShipName(String newShipName){
	shipName = newShipName;
}

/**
 * Gets ship name
 * @return Ship's name of type String
 */
public String getShipName(){
	return shipName;
}

// toString and equals

/**
 * toString method
 * @return This objects attributes in a readable format of type String
 */
public String toString(){
	return super.toString() + "\nBuild Year: " + buildYear +"\nShip Name: " + shipName;
}

/**
 * Equals method 
 */
public boolean equals(Object obj){
	// uses the parent equals to check if the other object is null, and then check if the objects are of the same class. If so, cast to that class, and check each individual attribute. This should prevent any crashing.
	if(super.equals(obj)) {
		Ferry fobj = (Ferry) obj;
		return (
			fobj.buildYear == this.buildYear &&
			fobj.shipName == this.shipName);
	}
	else{return false;}
}
}
