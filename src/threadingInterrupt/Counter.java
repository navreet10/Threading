package threadingInterrupt;

public class Counter implements Runnable{

	@Override
	public void run() {
		Thread ct = Thread.currentThread();
		int count = 1;
		System.out.println("Timer begins");
		
		while(count != 10000) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("wait");
			}
			System.out.println("Elapsed Time: " + count + " seconds");
			System.out.println(ct.getName() + " running");
			count++;
		}
		
		
	}
	
	
}
