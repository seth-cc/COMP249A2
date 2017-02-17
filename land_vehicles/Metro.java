// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

package land_vehicles;

import public_transport.*;

public class Metro extends CityBus {
private int vehicleNum;
private String cityName;

// Constructors
public Metro(){
	super();
	vehicleNum = 0;
	cityName = "";
}

public Metro(double newTicketPrice, int newStopsNum, long newRouteNumber, int newBeginOperationYear, String newLineLane, String newDriverName, int newVehicleNum, String newCityName){
	super(newTicketPrice, newStopsNum, newRouteNumber, newBeginOperationYear, newLineLane, newDriverName);
	vehicleNum = newVehicleNum;
	cityName = newCityName;
}

public Metro(Metro obj){
	super((CityBus) obj);
	vehicleNum = obj.vehicleNum;
	cityName = obj.cityName;
}

// Setters and Getters

public void setVehicleNum(int newVehicleNum){
	vehicleNum = newVehicleNum;
}

public int getVehicleNum(){
	return vehicleNum;
}

public void setCityName(String newCityName){
	cityName = newCityName;
}

public String getCityName(){
	return cityName;
}

// ToString and equals
public String toString(){
	return super.toString() + "\nVehicle Number: " + vehicleNum +"\nCity Name: " + cityName;
}

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
