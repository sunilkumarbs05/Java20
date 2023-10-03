package thread;

public class RunnableThreadMain {
	
	public static void main(String[] args) {
		MyRunnableThread myRunnableThread = new MyRunnableThread();
		MyRunnableThread myRunnableThread1 = new MyRunnableThread();
		
		Thread thread = new Thread(myRunnableThread);
		Thread thread1 = new Thread(myRunnableThread1);
		thread.start();
		thread1.start();
		thread1.start();
	}

}
