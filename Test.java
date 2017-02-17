// -----------------------------------------------------
// Assignment #2 COMP 249 Section S
// Part: 1
// Written by:  Anne Ehresmann - 27858906, and Seth Cole - 27795580
// -----------------------------------------------------

import public_transport.*;
import land_vehicles.*;
import marine_vehicles.*;
import air_vehicles.*;

public class Test {
public static void main(String[] args) {

	// Testing each individual class various constructors.
	Ferry A = new Ferry();
	CityBus B = new CityBus(1,1,5,1964,"H75","Marcus Aurelius");
 	CityBus C = new CityBus((CityBus) B);
	AirCraft D = new AirCraft(5,5, AirCraft.ClassType.GLIDER, AirCraft.MaintenanceType.YEARLY);
	Tram E = new Tram(10,20,110,1997,"A87", "Caligula", 70);
	Metro F = new Metro(1.5,20,550,2001,"B55","Hadrian",999,"Stratford-Upon-Avon");

	System.out.println("I am A. " + A + "\n");
	System.out.println("I am B. " + B + "\n");
	System.out.println("I am C. " + C + "\n");
	System.out.println("I am D. " + D + "\n");
	System.out.println("I am E. " + E + "\n");
	System.out.println("I am F. " + F + "\n");

	System.out.println("Is A equal to B? \t" + A.equals(B));
	System.out.println("Is B equal to C? \t" + B.equals(C));
	System.out.println("Is C equal to B? \t" + C.equals(B));

	PublicTransportation[] pubTrans = new PublicTransportation[10];

	pubTrans[0] = new PublicTransportation(10,20);
	pubTrans[1] = new CityBus (20,20,5,1999,"A01", "Nerva");
	pubTrans[2] = new CityBus((CityBus) pubTrans[1]);
	pubTrans[3] = new Tram();
	pubTrans[4] = new Metro(45,10,111,2014,"A02","Antoninus Pius",759,"Cordoba");
	pubTrans[5] = new Ferry(5,10,1809,"HMS Covenant");
	pubTrans[6] = new AirCraft(15,29,AirCraft.ClassType.HELICOPTER,AirCraft.MaintenanceType.WEEKLY);
	pubTrans[7] = new Tram(35,20,110,2007,"A03","Tiberius",200);
	pubTrans[8] = new Tram((Tram) pubTrans[7]);
	pubTrans[9] = new AirCraft((AirCraft) pubTrans[6]);


	// cheapest items
	PublicTransportation cheap1 = pubTrans[0];
	int cheap1_int = 0;
	PublicTransportation cheap2 = pubTrans[1];
	int cheap2_int = 0;
	for(int i = 0; i< pubTrans.length; i++){
		if (pubTrans[i].getTicketPrice() < cheap1.getTicketPrice()){
			cheap2 = cheap1;
			cheap1 = pubTrans[i];
			cheap2_int = cheap1_int;
			cheap1_int = i;
		}
		else if (pubTrans[i].getTicketPrice() < cheap2.getTicketPrice()){
			cheap2 = pubTrans[i];
			cheap2_int = i;
		}
	}
	System.out.println("Out of all vehicles in pubTrans, the ones with the cheapest prices are a " + cheap1.getClass().getSimpleName() + " with a ticket price of " + cheap1.getTicketPrice() +" and a " + cheap2.getClass().getSimpleName() +" with a ticket price of " + cheap2.getTicketPrice());
	System.out.println(cheap1 + "\nI am number " + (cheap1_int + 1) + " in the array.\n");
	System.out.println(cheap2 + "\nI am number " + (cheap2_int + 1) + " in the array.\n");


	// most expensive items.
	PublicTransportation exp1 = pubTrans[0];
	int exp1_int = 0;
	PublicTransportation exp2 = pubTrans[1];
	int exp2_int = 0;
	for(int i = 0; i< pubTrans.length; i++){
		if (pubTrans[i].getTicketPrice() >  exp1.getTicketPrice()){
			exp2 = exp1;
			exp1 = pubTrans[i];
			exp2_int = exp1_int;
			exp1_int = i;
		}
		else if (pubTrans[i].getTicketPrice() > exp2.getTicketPrice()){
			exp2 = pubTrans[i];
			exp2_int = i;
		}
	}
	System.out.println("Out of all vehicles in pubTrans, the ones with the most expensive prices are a " + exp1.getClass().getSimpleName() + " with a ticket price of " + exp1.getTicketPrice() +" and a " + exp2.getClass().getSimpleName() +" with a ticket price of " + exp2.getTicketPrice());
	System.out.println(exp1 + "\nI am number " + (exp1_int + 1) + " in the array.\n");
	System.out.println(exp2 + "\nI am number " + (exp2_int + 1) + " in the array.\n");


}
}
