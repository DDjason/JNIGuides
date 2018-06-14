class Prompt{
	//native method that prints a promat and reads a line 
	private native String getLine(String promat);
	public static void main(String args[]){
		Prompt p = new Prompt();
		String input = p.getLine("Type a line : ");
		System.out.println("User type : " + input);
	}

	static {
		System.load("/home/jason/code/JNI/2/Prompt.so");
	}


}
