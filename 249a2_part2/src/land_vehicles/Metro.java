// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

package land_vehicles;

import public_transport.*;

/**
 * A Metro class extending the CityBus class with additional attributes
 * @author Anne Ehresmann
 * @author Seth Cole
 * @version 1.0
 * @see CityBus
 * @See PublicTransportation
 */
public class Metro extends CityBus {

private int vehicleNum;

private String cityName;

// Constructors
/**
 * Default Constructor
 */
public Metro(){
	super();
	vehicleNum = 0;
	cityName = "";
}

/**
 * Parameterized constructor
 * @param newTicketPrice Ticket price of type double
 * @param newStopsNum Number of stops of type int
 * @param newRouteNumber Route number of type long
 * @param newBeginOperationYear First year of operation of type int
 * @param newLineLane Line lane of type String
 * @param newDriverName Name of the driver of type String
 * @param newVehicleNum Vehicle number of type int
 * @param newCityName Name of city of operation of type String
 */
public Metro(double newTicketPrice, int newStopsNum, long newRouteNumber, int newBeginOperationYear, String newLineLane, String newDriverName, int newVehicleNum, String newCityName){
	super(newTicketPrice, newStopsNum, newRouteNumber, newBeginOperationYear, newLineLane, newDriverName);
	vehicleNum = newVehicleNum;
	cityName = newCityName;
}

/**
 * Copy constructor
 * @param obj An object of type Metro
 */
public Metro(Metro obj){
	super((CityBus) obj);
	vehicleNum = obj.vehicleNum;
	cityName = obj.cityName;
}

// Setters and Getters

/**
 * A mutator for the VehicleNum attribute
 * @param newVehicleNum Vehicle number of type int
 */
public void setVehicleNum(int newVehicleNum){
	vehicleNum = newVehicleNum;
}

/**
 * Accessor for the VehicleNum attribute
 * @return VehicleNum of type int
 */
public int getVehicleNum(){
	return vehicleNum;
}

/**
 * @param newCityName
 */
public void setCityName(String newCityName){
	cityName = newCityName;
}

/**
 * @return
 */
public String getCityName(){
	return cityName;
}

// ToString and equals
/**
 * toString method
 * @return This objects attributes in a readable format of type String
 */
public String toString(){
	return super.toString() + "\nVehicle Number: " + vehicleNum +"\nCity Name: " + cityName;
}

/**
 * Equals method 
 */
public boolean equals(Object obj){
	// uses the parent equals to check if the other object is null, and then check if the objects are of the same class. If so, cast to that class, and check each individual attribute. This should prevent any crashing.
	if(super.equals(obj)) {
		Metro metroobj = (Metro) obj;
		return (
			metroobj.vehicleNum == this.vehicleNum &&
			metroobj.cityName == this.cityName);
	}
	else{return false;}
}


}
