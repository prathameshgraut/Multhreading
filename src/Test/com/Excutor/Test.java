package Test.com.Excutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {

		MyWork mw = new MyWork();
//		mw.start();
		 ExecutorService e = Executors.newCachedThreadPool();
		 e.submit(mw); 
	}
}

class MyWork extends Thread {

	@Override
	public void run() {
		demo.m1();
	}
}

class demo {

	
	
	static void m1() {
		System.out.println("Hello1"+Thread.currentThread().getName());
		System.out.println("Hello2"+Thread.currentThread().getName());
		System.out.println("Hello3"+Thread.currentThread().getName());
		System.out.println("Hello4"+Thread.currentThread().getName());
	}

}
