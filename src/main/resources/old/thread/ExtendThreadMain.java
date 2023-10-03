package thread;

public class ExtendThreadMain {
	
	public static void main(String[] args) {
		
		MyExtendThread myExtendThread = new MyExtendThread();
		MyExtendThread myExtendThread1 = new MyExtendThread();
		MyExtendThread myExtendThread2 = new MyExtendThread();
		
		myExtendThread.start();
//		try {
//			myExtendThread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		myExtendThread.yield();
		myExtendThread1.start();
		
		
//		myExtendThread2.start(); 
	}

}
