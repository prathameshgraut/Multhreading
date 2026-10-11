package callableee.com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class hello {

	public static void main(String[] args) throws Exception {
		mycallable mc = new mycallable(); 
		
		ExecutorService ex = Executors.newCachedThreadPool();
	    Future<String> future=	ex.submit(mc);
		System.out.println(future.get());
	    
		
//		System.out.println( mc.call());
	}
}


/*
 * callable its interface to used for , Return the value then use callable interface
 * have call method with return type
 */

class mycallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		return "hello callable";
	}
	
}
