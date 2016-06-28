package Interrupt;

public class InterruptChild implements Runnable{
	private Thread mom;
	
	public InterruptChild (Thread mom) {
		this.mom = mom;
	}
	

	@Override
	public void run() {
		//Thread ct = Thread.currentThread();
		System.out.println("I am interrupting");
		
		while(true) {
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				break;
			}
			mom.interrupt();
			System.out.println(mom.getName() + " interrupting");
		}
		System.out.println("User paused the timer.");
		
	}

}
