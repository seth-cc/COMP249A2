// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

package land_vehicles;

import public_transport.*;

public class CityBus extends PublicTransportation {
protected long routeNumber;
protected int beginOperationYear;
protected String lineLane;
protected String driverName;

// Constructors
public CityBus(){
	super();
	routeNumber = 0;
	beginOperationYear = 0;
	lineLane = "";
	driverName = "";
}

public CityBus(double newTicketPrice, int newStopsNum, long newRouteNumber, int newBeginOperationYear, String newLineLane, String newDriverName){
	super(newTicketPrice, newStopsNum);
	routeNumber = newRouteNumber ;
	beginOperationYear = newBeginOperationYear ;
	lineLane = newLineLane;
	driverName = newDriverName;
}

public CityBus(CityBus obj){
	super((PublicTransportation) obj);
	routeNumber = obj.routeNumber;
	beginOperationYear = obj.beginOperationYear;
	lineLane = obj.lineLane;
	driverName = obj.driverName;

}

// Setters and Getters
public void setRouteNumber(long newRouteNumber){
	routeNumber = newRouteNumber;
}
public long getRouteNumber(){
	return routeNumber;
}

public void setBeginOperationYear(int newBeginOperationYear){
	beginOperationYear = newBeginOperationYear;
}

public int getBeginOperationYear(){
	return beginOperationYear;
}

public void setLineLane(String newLineLane){
	lineLane = newLineLane;
}

public String getLineLane(){
	return lineLane;
}

public void setDriverName(String newDriverName){
	driverName = newDriverName;
}

public String getDriverName(){
	return driverName;
}
// ToString and equals
public String toString(){
	return super.toString() + "\nRoute Number: " + routeNumber + "\nBegin Operation Year: " + beginOperationYear + "\nLine Lane: " + lineLane +"\nDriver Name: " + driverName;
}

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
