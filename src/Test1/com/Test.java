package Test1.com;

public class Test {
	public static void main(String[] args) {
		
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
		
		
		
		
		MyThreads m1 = new MyThreads(printer1,"Hello");
		MyThreads m2 = new MyThreads(printer1,"Prathamesh");
		MyThreads m3 = new MyThreads(printer1,"Raut");
		MyThreads m4 = new MyThreads(printer1,"Bye");
		m1.start();
		m2.start();
		m3.start();
		m4.start();
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
		System.out.println(Thread.currentThread().getName()+    message);
	}
}
