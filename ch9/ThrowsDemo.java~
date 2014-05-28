class ThrowsDemo {
	public static char prompt(String str)
		throws java.io.IOException { //throw clause
	
	System.out.print(str + ": ");
	return (char) System.in.read();
	}

	public static void main(String[] args) {
	 char ch;
		
	 try {
		ch = prompt("Enter a letter: "); //Since prompt() might throw an exception, a call to it
		}				//must be enclosed wihtin a try block
	catch(java.io.IOException exc) {
		System.out.println("I/O exception occured.");
		ch = 'X';
		}
	System.out.println("You pressed " + ch);
	}
}
