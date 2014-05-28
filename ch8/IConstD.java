//An interface contains constants
interface IConst {
	int MIN = 0;
	int MAX = 10; //constants
	String ERRORMSG = "Boundary Error";

}

class IConstD implements IConst {
	public static void main(String[] args) {
		int nums[] = new int [MAX];

		for(int i = MIN; i < 11; i++) {
			if(i >= MAX) System.out.println(ERRORMSG);
			else {
			 nums[i] = i;
			 System.out.print(nums[i] + " ");
			}
		}
	}

}
