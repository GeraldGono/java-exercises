class Rethrow {
	public static void genException() {
		//here, numer is longer than denom.
	int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
	int denom[] = { 2, 0, 4, 4, 0, 8 };

	
	for(int i = 0; i < numer.length; i++) {
		try{ // Nested try blocks
			System.out.println(numer[i] + " / " +
					   denom[i] + " is " + 
					   numer[i]/denom[i]);
			}
		catch (ArithmeticException exc) { //multiple catch statements
			//catch the exception
			System.out.println("Can't divide by zero!");
			} 
		
		catch (ArrayIndexOutOfBoundsException exc) { //multiple catch statements
			//catch the exception
			System.out.println("No matching element found.");
			 throw exc; // rethrow the exception
			}
		}
	}
}
	

