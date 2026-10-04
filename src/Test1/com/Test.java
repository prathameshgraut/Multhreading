package Test1.com;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		//0
		Printer printer1 = new Printer();
//		printer1.message="Hello";
//		
//		//1
//		Printer printer2 = new Printer();
//		printer2.message="Prathamesh";
//		
//		//2
//		Printer printer3 = new Printer();
//		printer3.message="Raut";
//		
//		//3
//		Printer printer4 = new Printer();
//		printer4.message="Jalgaon";
		
		
		
		
		MyThreads m0 = new MyThreads(printer1,"0");
		MyThreads m1 = new MyThreads(printer1,"1");
		MyThreads m2 = new MyThreads(printer1,"2");
		MyThreads m3 = new MyThreads(printer1,"3");
		MyThreads m4 = new MyThreads(printer1,"4");
		MyThreads m5 = new MyThreads(printer1,"5");
		MyThreads m6 = new MyThreads(printer1,"6");
		MyThreads m7 = new MyThreads(printer1,"7");
		MyThreads m8 = new MyThreads(printer1,"8");
		MyThreads m9 = new MyThreads(printer1,"9");
		MyThreads m10 = new MyThreads(printer1,"10");
		MyThreads m11 = new MyThreads(printer1,"11");
		MyThreads m12 = new MyThreads(printer1,"12");
		MyThreads m13 = new MyThreads(printer1,"13");
		MyThreads m14 = new MyThreads(printer1,"14");
		MyThreads m15 = new MyThreads(printer1,"15");
		MyThreads m16 = new MyThreads(printer1,"16");
		MyThreads m17 = new MyThreads(printer1,"17");
		MyThreads m18 = new MyThreads(printer1,"18");
		MyThreads m19 = new MyThreads(printer1,"19");
		m0.start();
		Thread.sleep(1000);
		m1.start();
		Thread.sleep(1000);
		m2.start();
		Thread.sleep(1000);
		m3.start();
		Thread.sleep(1000);
		m4.start();
		Thread.sleep(1000);
		m5.start();
		Thread.sleep(1000);
		m6.start();
		Thread.sleep(1000);
		m7.start();
		Thread.sleep(1000);
		m8.start();
		Thread.sleep(1000);
		m9.start();
		Thread.sleep(1000);
		m10.start();
		Thread.sleep(1000);
		m11.start();
		Thread.sleep(1000);
		m12.start();
		Thread.sleep(1000);
		m13.start();
		Thread.sleep(1000);
		m14.start();
		Thread.sleep(1000);
		m15.start();
		Thread.sleep(1000);
		m16.start();
		Thread.sleep(1000);
		m17.start();
		Thread.sleep(1000);
		m18.start();
		Thread.sleep(1000);
		m19.start();
		
	}
}


class MyThreads extends Thread{
	private Printer printer;
	private String message;
	
	

	public MyThreads(Printer printer, String message) {
		this.printer = printer;
		this.message = message;
	}



	@Override
	public void run() {
		printer.print(message);
	}
}

class Printer {
	String message;
	
	public void print(String message) {
		System.out.println(Thread.currentThread().getName()+"  =  "+ message);
	}
}
