//This class declares an object of type Vehicle.
class VehicleDemo {
	public static void main(String[] args) {
	 Vehicle minivan = new Vehicle(); //declare and allocate reference to a Vehicle object
	 int range;
		
	 // assign values to fields in minivan
	 minivan.passengers = 7;
	 minivan.fuelcap = 16;
	 minivan.mpg = 21; //access the member of the class Vehicle

	 //compute the range assuming a full tank of gas
	 range = minivan.fuelcap * minivan.mpg;
	 System.out.println("Minivan can carry " + minivan.passengers + 
		" with a range of " + range);	
	}

}
