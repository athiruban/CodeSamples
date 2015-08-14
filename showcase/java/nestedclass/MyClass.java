
/*
 * Program to test nested interface is static or non-static
 */ 

public class MyClass {
	public static void main(String args[]) {
		/*
		 * Create an object using the interface!
		 */
		 
		 Vehicle.AutoDrivable ref;

		 /*
		  * It worked so like nested enum, nested interface is also static by default.
		  */

		 ref = new Vehicle.AutoDrivable() {
		 	public boolean hasAutoMode() {
		 		return true;
		 	}
		 }; 

		 Vehicle mycar = new Vehicle();
		 mycar.autopilot = ref;
		 
		 System.out.println("Autopilot check: " + mycar.autopilot.hasAutoMode() + " " + ref.hasAutoMode());
	}
}

class Vehicle {
	private String name;
	private int top_speed_in_kmph;
	protected AutoDrivable autopilot;
	public interface AutoDrivable{
		public boolean hasAutoMode();
	}
}