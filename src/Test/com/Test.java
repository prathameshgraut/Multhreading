package Test.com;

/*
 * Multithredaing mean perform multiple task at time then we can go for multithreding
 * we can achive multhreding then extends Tread and Implements Runnable Interface 
 * Thread class have Start() Method
 * start() method use for scheduled & create Thread
 * run() method inside Runnable Interface this is abstrct method 
 * run() method use for perform task
 * sleep () use for paused thread
 * 
 * 
 * Three ways to achive multithreading 
 * 1.Extends Thread class 
 * 2.Implements Runnable Interface
 * 3.Lambda Expression
 * 
 * 
 * Synchronized Keyword :
 * Synchronized use to access only one thread at time 
 * Synchronized keyword use for avoid inconsistancy output or data
 * Synchronized use in block and method level
 * if they are static method then class level Synchronized block to access class name 
 * if they are non-static method then object level Synchronized block to access this keyword
 * 
 * 
 * 
 * 
 * **/

public class Test{
	public static void main(String[] args) throws InterruptedException {
		Test1 t1 = new Test1();
		t1.setname("Prathamesh");
		
		Test1 t2 = new Test1();
		t2.setname("Bhavesh");
		
		Test1 t3 = new Test1();
		t3.setname("Sai Ram");
		
		Test1 t4 = new Test1();
		t4.setname("Pratik");
		
		Test1 t5 = new Test1();
		t5.setname("Harshal");
		
		t1.start();
		t1.sleep(2000);
		t2.start();
		t3.start();
		t4.start();
		t4.sleep(1000);
		t5.start();
	}
}


