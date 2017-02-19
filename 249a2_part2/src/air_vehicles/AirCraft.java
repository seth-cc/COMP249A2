// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

package air_vehicles;

import public_transport.*;

/**
 * An AirCraft class which extends the PublicTransportation class with additional attributes
 * @author Anne Ehresmann
 * @author Seth Cole
 * @version 1.0
 * @see PublicTransportation
 */
public class AirCraft extends PublicTransportation {


public enum ClassType {HELICOPTER, AIRLINE, GLIDER, BALLOON};

public enum MaintenanceType {WEEKLY, MONTHLY, YEARLY};


public ClassType classt;

public MaintenanceType maint;

// Constructors
/**
 * Default constructor
 */
public AirCraft(){
	super();
	classt = ClassType.HELICOPTER;
	maint = MaintenanceType.WEEKLY;
}
/**
 * Parameterized constructor
 * @param newTicketPrice Ticket price of type double
 * @param newStopsNum Number of stops of type int
 * @param newClass Vehicle class enum
 * @param newMaint Maintenance type enum
 */
public AirCraft(double newTicketPrice, int newStopsNum, ClassType newClass, MaintenanceType newMaint){
	super(newTicketPrice, newStopsNum);
	classt = newClass;
	maint = newMaint;
}

/**
 * Copy constructor
 * @param obj An object of type AirCraft
 */
public AirCraft(AirCraft obj){
	super(obj);
	classt = obj.classt;
	maint = obj.maint;
}

// Setters and Getters
/**
 * Sets class type
 * @param newClassType Class type 
 */
public void setClassType(ClassType newClassType){
	classt= newClassType;
}

/**
 * Gets class type
 * @return Class type 
 */
public ClassType getClassType(){
	return classt;
}

/**
 * Sets maintenance type
 * @param newMaintenanceType Maintenance type
 */
public void setMaintenanceType(MaintenanceType newMaintenanceType){
	maint = newMaintenanceType;
}

/**
 * Gets maintenance type
 * @return Maintenance type
 */
public MaintenanceType getMaintenanceType (){
	return maint;
}

// toString and equals
/**
 * toString method
 * @return This objects attributes in a readable format of type String
 */
public String toString(){
	return super.toString() + "\nClass Type: " + classt + "\nMaintenance Type: " + maint;
}

/**
 * Equals method 
 */
public boolean equals(Object obj){
	// uses the parent equals to check if the other object is null, and then check if the objects are of the same class. If so, cast to that class, and check each individual attribute. This should prevent any crashing.
	if(super.equals(obj)){
		AirCraft acobj = (AirCraft) obj;
		return (
		acobj.classt == this.classt &&
		acobj.maint == this.maint
		);
	}
	else{return false;}
}
}
