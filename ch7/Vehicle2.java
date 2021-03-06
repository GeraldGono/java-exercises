class Vehicle2 {
	private int passengers; //number of passengers
	private int fuelcap;  	//fuel capacity in gallons
	private int mpg;	//fuel consumption in miles per gallon

	// This is a constructor for vehicle.
	Vehicle2(int p, int f, int m) {
	 passengers = p;
	 fuelcap = f;
	 mpg = m;

	} 
	//Return the range.
	int range() {
	 return mpg * fuelcap;
	}

	//Compute fuel needed for a given distance.
	double fuelneeded(int miles) {
	 return (double) miles/mpg;
	}

	//Access methods for instance variables.
	int getPassengers() { return passengers; }
	void setPassengers(int p) { passengers = p;}
	int getFuelcap() { return fuelcap; }
	void setFuelcap(int f) { fuelcap = f;}
	int getMpg() { return mpg; }
	void setMpg(int m) { mpg = m;}
	}
	
	// Extend Vehicle to create a Truck specialization
	class Truck extends Vehicle2 {
	 private int cargocap; //cargo capacity in pounds

		//This is a constructor for Truck.
		Truck(int p, int f, int m, int c) {
		 /* initialize Vehicle2 members using Vehicle's constructor */
		super(p, f, m);

		cargocap = c;
		}
	//Accessor methods for cargocap.
	int getCargo() { return cargocap; }
	void putCargo(int c) { cargocap = c;}
}
