package Test.com11;

import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class producer extends Thread {

	private Stack<String> PostBox;

	public producer(Stack<String> postBox) {
		this.PostBox = postBox;
	}



	@Override
	public void run()  {

		Lock l = new ReentrantLock();
		
//		synchronized (PostBox) {
		try {
            l.tryLock(1000,TimeUnit.MILLISECONDS);
		}catch(Exception e) {
			
		}
			System.out.println("producing");
			System.out.println(PostBox.push("Hi Prathmesh"));
			System.out.println("Done ...Produce Data");
//			PostBox.notify();
			l.unlock();
//		}
			
			
			
	}
}
