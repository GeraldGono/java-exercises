class Stack {
	private char stck[];
	private int tos;

	Stack(int size){
		stck = new char[size];
		tos = 0;
	}


	Stack(Stack ob) {
	  tos = ob.tos;
	  stck = new char[ob.stck.length];

	  for(int x = 0; x < tos; x++)
		stck[x] = ob.stck[x];
	}

	Stack(char b[]) {
		stck = new char[b.length];

	for(int x = 0; x < b.length; x++){
	push(b[x]);
	}
      }
	void push(char ch) {
	 if(tos == stck.length) {
		System.out.println(" --Stack is full. ");
		return;
	}
	stck[tos] = ch;
	tos++;
	}

	char pop() {
	if(tos == 0){
	System.out.println(" --Stack is empty.");
	}
	
	tos--;
	return stck[tos];
	}
      }
