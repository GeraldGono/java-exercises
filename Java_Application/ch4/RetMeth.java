class RetMeth {
	public static void main(String[] args) {
	 Vehicle minivan = new Vehicle();
	 Vehicle sportscar = new Vehicle();

	 int rangeA, rangeB;

	 //assign values to fields in minivan
	 minivan.passengers = 7;
	 minivan.fuelcap = 16;
   	 minivan.mpg = 21;

	 //assign values to fields in sportscar
	 sportscar.passengers = 2;
	 sportscar.fuelcap = 14;
   	 sportscar.mpg = 12;

	 //get the ranges
	 rangeA = minivan.range2(); //assign the values returned to a variable
 	 rangeB = sportscar.range2();

	System.out.println("Minivan can carry " + minivan.passengers + 
		" with range of " + rangeA + " Miles");
	System.out.println("Sportscar can carry " + sportscar.passengers + 
		" with range of " + rangeB + " Miles");
	}

}
