class Encode {
	public static void main(String[] args){
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		int key = 88;

		System.out.print("Original message:  ");
		System.out.println(msg);

		//encode the message
		for(int i = 0; i < msg.length(); i++)
		  encmsg = encmsg + (char) (msg.charAt(i) ^ key);//construct the encoded string

		System.out.print("Encoded message: ");
		System.out.println(encmsg);

		//decode the message
		for(int i = 0; i < msg.length(); i++)
		  decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);//construct the decoded string
		System.out.print("Decoded message: ");
		System.out.println(decmsg);
	}
}
