package Test.com11;

import java.util.Stack;

public class consumer extends Thread {
	
	private Stack<String> PostBox;
	
	public consumer(Stack<String> postBox) {
		this.PostBox = postBox;
	}




	@Override
	public void run() {
		
		synchronized (PostBox) {
			
		System.out.println("Consuming Data / (Hold)");
		try {
		PostBox.wait();
		}catch(Exception e) {
		}
		}
		System.out.println("Done .... Consume : "+PostBox.pop());
		}
}
