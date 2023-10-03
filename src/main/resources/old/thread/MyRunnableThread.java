package thread;

public class MyRunnableThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread is " + Thread.currentThread().getName() + " Value: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
