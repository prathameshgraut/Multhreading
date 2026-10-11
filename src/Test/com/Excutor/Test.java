package Test.com.Excutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {

		MyWork1 mw1 = new MyWork1();
		MyWork2 mw2 = new MyWork2();
		MyWork3 mw3 = new MyWork3();
		MyWork4 mw4 = new MyWork4();
		
//		mw.start();
//		 ExecutorService e = Executors.newCachedThreadPool();
		
		
		/*
		 * newFixedThreadPool() :- used for excuted number of thread.
		 * 
		 * */
		
		
		ExecutorService e = Executors.newFixedThreadPool(4);
		 e.submit(mw1); 
		 e.submit(mw2); 
		 e.submit(mw3); 
		 e.submit(mw4); 
	}
}

class MyWork1 extends Thread {

	@Override
	public void run() {
		demo.m1();
	}
}

class MyWork2 extends Thread {

	@Override
	public void run() {
		demo.m2();
	}
}
class MyWork3 extends Thread {

	@Override
	public void run() {
		demo.m3();
	}
}

class MyWork4 extends Thread {

	@Override
	public void run() {
		demo.m4();
	}
}

class demo 
{

	static void m1() {
		System.out.println("Hello1  "+Thread.currentThread().getName());
//		System.out.println("Hello2   "+Thread.currentThread().getName());
//		System.out.println("Hello3   "+Thread.currentThread().getName());
//		System.out.println("Hello4   "+Thread.currentThread().getName());
	}
	
	static void m2() {
		System.out.println("Hello2  "+Thread.currentThread().getName());
	}
	
	static void m3() {
		System.out.println("Hello3  "+Thread.currentThread().getName());
	}
	static void m4() {
		System.out.println("Hello4  "+Thread.currentThread().getName());
	}

}
