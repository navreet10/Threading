package threadingInterrupt;

import java.util.Scanner;


public class ThreadInterrupt {
	public static void main(String[] args) {
		System.out.println("Press Enter Key to stop timer");
		Thread counter1 = new Thread(new Counter());
		counter1.start();
		Thread counter2 = new Thread(new Counter());
		counter2.start();
		Scanner in = new Scanner(System.in);
		String s = "start";
		Thread ct = Thread.currentThread();
		while(!s.equals("")) {
			s = in.nextLine();
			System.out.println(ct.getName() + " running");
		}
		counter1.interrupt();
		counter2.interrupt();
		in.close();
	}

}
