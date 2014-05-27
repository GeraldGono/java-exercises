/* 
	Try This 1-2

	This program displays a conversion
	table of gallons to liters
	
	Call this program "GaltoLitTable.java"
*/
class GalToLitTable {
	public static void main(String[] args){
		double gallons, liters;
		int counter;

		counter = 0; //line counter is initially set to zero
		for(gallons = 1; gallons <= 100; gallons++){
			liters = gallons * 3.7854; //convert to liters
			System.out.println(gallons + "gallons is "+ 
				liters + "liters.");
		counter++;//increment the line counter with each loop iterations
		//every 10th line, print a blank line
		if(counter == 10){ //if counter is 10 output a blank line
			System.out.println();
			counter = 0; //reset the line counter
			}
		}

	}
	
}
