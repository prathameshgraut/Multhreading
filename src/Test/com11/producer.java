package Test.com11;

import java.util.Stack;

public class producer extends Thread {

	private Stack<String> PostBox;

	
	
	public producer(Stack<String> postBox) {
		this.PostBox = postBox;
	}



	@Override
	public void run() {

		synchronized (PostBox) {

			System.out.println("producing");
			System.out.println(PostBox.push("Hi Prathmesh"));
			System.out.println("Done ...Produce Data");
			PostBox.notify();
		}
	}
}
