package thread.priority.com;

public class threadProprity {
	public static void main(String[] args) {
		demo1 d1 = new demo1();
		demo2 d2 = new demo2();
		demo3 d3 = new demo3();
		
		d1.start();
		d2.start();
		d3.start();
		d1.setPriority(5);
		d2.setPriority(1);
		d3.setPriority(10);
	}
}


class demo1 extends Thread{
	@Override
	public void run() {
		System.out.println("Hello1 "+Thread.currentThread().getName());
	}
}

class demo2 extends Thread{
	@Override
	public void run() {
		System.out.println("Hello2 "+Thread.currentThread().getName());
	}
}

class demo3 extends Thread{
	@Override
	public void run() {
		System.out.println("Hello3 "+Thread.currentThread().getName());
	}
}
