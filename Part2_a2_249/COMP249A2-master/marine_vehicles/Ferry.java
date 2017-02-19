// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

package marine_vehicles;
import public_transport.*;

public class Ferry extends PublicTransportation {
private int buildYear;
private String shipName;

// Constructors
public Ferry(){
	super();
	buildYear = 0;
	shipName = "";
}

public Ferry(double newTicketPrice, int newStopsNum,int newBuildYear, String newShipName){
	super(newTicketPrice, newStopsNum);
	buildYear = newBuildYear;
	shipName = newShipName;
}

public Ferry(Ferry obj){
	super((PublicTransportation) obj);
	buildYear = obj.buildYear;
	shipName = obj.shipName;
}

// Setters and Getters

public void setBuildYear(int newBuildYear){
	buildYear = newBuildYear;
}

public int getBuildYear(){
	return buildYear;
}

public void setShipName(String newShipName){
	shipName = newShipName;
}

public String getShipName(){
	return shipName;
}

// toString and equals
public String toString(){
	return super.toString() + "\nBuild Year: " + buildYear +"\nShip Name: " + shipName;
}

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
