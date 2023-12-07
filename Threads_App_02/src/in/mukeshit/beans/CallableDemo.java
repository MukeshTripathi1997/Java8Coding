package in.mukeshit.beans;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {
	public static void main(String[] args) {
		/*
		 * Callable callable = new Callable() {
		 * 
		 * @Override public Object call() throws Exception { for (int i = 100; i <= 120;
		 * i++) { System.out.println(i); try { Thread.sleep(500);
		 * 
		 * } catch (Exception e) { e.printStackTrace(); } } return null; }
		 * 
		 * };
		 */
		Callable callable=() -> {
			for(int i=100;i<=110;i++) {
				System.out.println(i);
			}
			return null;
		};
		ExecutorService exService = Executors.newFixedThreadPool(2);
		exService.submit(callable);

	}

}
