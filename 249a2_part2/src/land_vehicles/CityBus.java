// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

package land_vehicles;

import public_transport.*;

/**
 * A CityBus class extending the PublicTransportation class with additional attributes.
 * @author Anne Ehresmann
 * @author Seth Cole
 * @version 1.0
 * @see PublicTransportation
 */
public class CityBus extends PublicTransportation {
private long routeNumber;
private int beginOperationYear;
private String lineLane;
private String driverName;
//Switching to private over protected access makes accessing attributes more difficult (necessitating use of accessor
//and mutator methods), but increases security of the effected attributes


// Constructors
/**
 * Default constructor
 */
public CityBus(){
	super();
	routeNumber = 0;
	beginOperationYear = 0;
	lineLane = "";
	driverName = "";
}

/**
 * Parameterized constructor
 * @param newTicketPrice Ticket price of type double
 * @param newStopsNum Number of stops of type int
 * @param newRouteNumber Route number of type long
 * @param newBeginOperationYear First year of operation of type int
 * @param newLineLane Line lane of type String
 * @param newDriverName Name of the driver of type String
 */
public CityBus(double newTicketPrice, int newStopsNum, long newRouteNumber, int newBeginOperationYear, String newLineLane, String newDriverName){
	super(newTicketPrice, newStopsNum);
	routeNumber = newRouteNumber ;
	beginOperationYear = newBeginOperationYear ;
	lineLane = newLineLane;
	driverName = newDriverName;
}

/**
 * Copy constructor
 * @param obj An object of the CityBus class
 */
public CityBus(CityBus obj){
	super((PublicTransportation) obj);
	routeNumber = obj.routeNumber;
	beginOperationYear = obj.beginOperationYear;
	lineLane = obj.lineLane;
	driverName = obj.driverName;

}

// Setters and Getters
/**
 * @param newRouteNumber A route number of type long
 */
public void setRouteNumber(long newRouteNumber){
	routeNumber = newRouteNumber;
}
/**
 * @return Returns a route number of type long
 */
public long getRouteNumber(){
	return routeNumber;
}

/**
 *  A mutator for the beginOperationYear attribute
 * @param newBeginOperationYear First year of operation of type int
 */
public void setBeginOperationYear(int newBeginOperationYear){
	beginOperationYear = newBeginOperationYear;
}

/**
 * @return Returns a first operation year of type int
 */
public int getBeginOperationYear(){
	return beginOperationYear;
}

/**
 * A mutator for the Linelane attribute
 * @param newLineLane a Line lane of type String
 */
public void setLineLane(String newLineLane){
	lineLane = newLineLane;
}

/**
 * @return Line lane of type string
 */
public String getLineLane(){
	return lineLane;
}

/**
 *  A mutator for the DriverName attribute
 * @param newDriverName A drivers name of type String
 */
public void setDriverName(String newDriverName){
	driverName = newDriverName;
}

/**
 * @return A drivers name of type String
 */
public String getDriverName(){
	return driverName;
}
// ToString and equals
/**
 * toString method
 *  @return This objects attributes in a readable format of type String
 */
public String toString(){
	return super.toString() + "\nRoute Number: " + routeNumber + "\nBegin Operation Year: " + beginOperationYear + "\nLine Lane: " + lineLane +"\nDriver Name: " + driverName;
}

/**
 * Equals method 
 */
public boolean equals(Object obj){
	// uses the parent equals to check if the other object is null, and then check if the objects are of the same class. If so, cast to that class, and check each individual attribute. This should prevent any crashing.

	if (super.equals(obj)) {
		CityBus cbobj = (CityBus) obj;
		return (
			cbobj.routeNumber == this.routeNumber &&
			cbobj.beginOperationYear == this.beginOperationYear &&
			cbobj.lineLane == this.lineLane &&
			cbobj.driverName == this.driverName);
	}
	else{return false;}

}

}
