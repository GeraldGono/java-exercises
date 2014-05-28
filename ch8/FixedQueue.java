// A fixed size queue class for characters.
class FixedQueue implements ICharQ {
	private char q[]; //this array holds the queue

	//Construct an empty queue given its size.
	public FixedQueue(int size) {
		q = new char[size+1]; //allocate memory for queue

	putloc = getloc = 0;
	}
	//Put a character into the queue
	public void put(char ch) {
	 if(putloc == q.length -1) {
		System.out.println(" - Queue is full.");
		return;
			
		}
		putloc++;
		q[putloc] = ch;
	}
	//Get a character from the queue.
	public char get() {
	 if(getloc == putloc) {
		System.out.println(" - Queue is empty.");
		return (char) 0;
		}
	getloc++;
	return q[getloc];
	}
}

