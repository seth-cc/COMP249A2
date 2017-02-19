// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

package land_vehicles;

import public_transport.*;

public class Tram extends CityBus {
private int maximumSpeed;



// Constructors
public Tram(){
	super();
	maximumSpeed = 0;
}

public Tram(double newTicketPrice, int newStopsNum, long newRouteNumber, int newBeginOperationYear, String newLineLane, String newDriverName, int newMaximumSpeed){
	super(newTicketPrice, newStopsNum, newRouteNumber, newBeginOperationYear, newLineLane, newDriverName);
	maximumSpeed = newMaximumSpeed;
}

public Tram(Tram obj){
	super((CityBus) obj);
	maximumSpeed = obj.maximumSpeed;
}


// Setters and Getters

public void setMaximumSpeed(int newMaximumSpeed){
	maximumSpeed = maximumSpeed;
}
public int getMaximumSpeed(){
	return maximumSpeed;
}

// toString and equals
public String toString(){
	return super.toString() + "\nMaximum Speed: " + maximumSpeed +"km/h";
}
public boolean equals(Object obj){
	// uses the parent equals to check if the other object is null, and then check if the objects are of the same class. If so, cast to that class, and check each individual attribute. This should prevent any crashing.
	if(super.equals(obj)) {
		Tram tramobj = (Tram) obj;
		return (tramobj.maximumSpeed == this.maximumSpeed);
	}
	else{return false;}
}
}
