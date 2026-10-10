package Test.com11;

import java.util.Stack;




public  class Test {

	public static void main(String[] args) {
		
		
		System.out.println("Avilable Thread :"+Runtime.getRuntime().availableProcessors());

		Stack<String> PostBox = new Stack<>();
		
		Thread t1 = new consumer(PostBox);
		Thread t2 = new producer(PostBox);
		
		t1.start();
		t2.start();
	}
}
