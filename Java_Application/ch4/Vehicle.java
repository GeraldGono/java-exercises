/* A program that uses the Vehicle class.
	
	Call this file VehicleDemo.java
*/
class Vehicle{
	int passengers; //number of passengers
	int fuelcap; //fuel capacity in gallons
	int mpg; //fuel consumption in miles per gallon

	//This is a constructor for Vehicle.
	Vehicle(int p, int f, int m){
	  passengers = p;
	  fuelcap = f;
	  mpg = m;
	}
	
	//Display the range
	void range1() { //range method is contained within the Vehicle class
	 System.out.println("Range is " + fuelcap * mpg);
	}

	
	//Return the range.
	int range2() {
	 return mpg * fuelcap; // return the range for a given vehicle
	}

	//compute fuel needed for a given distance
	double fuelneeded(int miles) {
	 return (double) miles / mpg;
	}
}

