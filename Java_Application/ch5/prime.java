class prime {
	public static void main(String[] args){
		int i, j;
		boolean isprime;

		for(i = 2; i < 100; i++){
			isprime = true;

		//check the number for even divisibility
		for(j = 2; j <= i/j; j++)
			//for the not prime
			if((i%j) == 0) isprime = false;
		if(isprime)
			System.out.println(i + " is prime.");		
		}
	}
}
