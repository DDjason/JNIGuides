public class HelloWorld{
	private native void print();
	public static void main(String[] args){
		new HelloWorld().print();
	}
	static {
		System.load("/home/jason/code/JNI/helloworld/HelloWorld.so");
	}
}
