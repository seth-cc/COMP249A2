// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

package air_vehicles;

import public_transport.*;

public class AirCraft extends PublicTransportation {

public enum ClassType {HELICOPTER, AIRLINE, GLIDER, BALLOON};
public enum MaintenanceType {WEEKLY, MONTHLY, YEARLY};

private ClassType classt;
private MaintenanceType maint;

// Constructors
public AirCraft(){
	super();
	classt = ClassType.HELICOPTER;
	maint = MaintenanceType.WEEKLY;
}
public AirCraft(double newTicketPrice, int newStopsNum, ClassType newClass, MaintenanceType newMaint){
	super(newTicketPrice, newStopsNum);
	classt = newClass;
	maint = newMaint;
}

public AirCraft(AirCraft obj){
	super(obj);
	classt = obj.classt;
	maint = obj.maint;
}

// Setters and Getters
public void setClassType(ClassType newClassType){
	classt= newClassType;
}

public ClassType getClassType(){
	return classt;
}

public void setMaintenanceType(MaintenanceType newMaintenanceType){
	maint = newMaintenanceType;
}

public MaintenanceType getMaintenanceType (){
	return maint;
}

// toString and equals
public String toString(){
	return super.toString() + "\nClass Type: " + classt + "\nMaintenance Type: " + maint;
}

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
