package thread;

public class MyExtendThread  extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread is " + Thread.currentThread().getName() + " Value: " + i+" Priority:"+Thread.currentThread().getPriority());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]){  
		 MyExtendThread t1=new MyExtendThread();  
		 MyExtendThread t2=new MyExtendThread();  
		 MyExtendThread t3=new MyExtendThread();  
		 t1.start();  
//		 try{  
//			  t1.join();  
//			 }catch(Exception e){System.out.println(e);}  
		 t2.start();  
		 
		 t3.start();  
		 }  
	
	

}
