class RethrowDemo {
	public static void main(String[] args) {
		try{
		 Rethrow.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc) { //catch rethrow exception
			//recatch exception
			System.out.println("Fatal Error - " +
					"program terminated...");
		}
	}
}
