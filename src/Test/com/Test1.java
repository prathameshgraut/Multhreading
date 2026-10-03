package Test.com;

public class Test1 extends Thread {
		private String name;
		
		
		public void setname(String name) {
			this.name=name;
		}
		
		
		public void run() {
			 System.out.println(Thread.currentThread().getName()+"   Hello    "+name);
		}
	
	
}
