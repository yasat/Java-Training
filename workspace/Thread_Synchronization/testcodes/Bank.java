package testcodes;

public class Bank{
	private static int val = 100;

	void deposit(int v) {
		val=val+v;
	}
	int getbal() {
		return(val);
	}
}
class Threadsrun implements Runnable{
	Bank b;
	Threadsrun(Bank ob){
		b=ob;
	}
	@Override
	public void run() {
		//To show case every thread transaction. 
		synchronized(b) { //try commenting this line with 23rd line and run it multiple times.
			b.deposit(10);
			System.out.println("the record of transaction: after depositing, the balance is "+b.getbal());
		}	
	}
}
class Mcl{
	public static void main(String[] args) throws InterruptedException {
		Bank b = new Bank();
		Thread t1 = new Thread(new Threadsrun(b));
		Thread t2 = new Thread(new Threadsrun(b));
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}
