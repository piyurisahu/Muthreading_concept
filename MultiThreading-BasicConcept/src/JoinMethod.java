
public class JoinMethod 
{
	public static void main(String[] args)
	{
		Thread t1=new Thread(new TestJoinMethod());
		Thread t2=new Thread(new TestJoinMethod());
		Thread t3=new Thread(new TestJoinMethod());

		
		t1.start();
		try {
			t1.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
	
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All thread completed its execution : now main exit");
	}
	

}

class TestJoinMethod implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread Started : "+Thread.currentThread().getName());
		 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Thread Ended : "+Thread.currentThread().getName());
	}
	}
