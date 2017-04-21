package WithOut_SynchronizeKeyword;

public class CheckSynchroniseMethod 
{
	public static void main(String[] arg)
	{
		ReadWriter_NotSynchronized w=new ReadWriter_NotSynchronized(new ReadWrite());
		
		System.out.println("If shared resource is unsynchronized\n");
		
		CreatingThread_NotSynchronized t1=new CreatingThread_NotSynchronized(w);
		CreatingThread_NotSynchronized t2=new CreatingThread_NotSynchronized(w);
		t1.start();;
		t2.start();
		try {
			t1.join();
			t2.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("If shared resource is synchronized\n");
		ReaderWriter_Synchronized rw_syn=new ReaderWriter_Synchronized(new ReadWrite());
		
		CreatingThread_Synchronized t3=new CreatingThread_Synchronized(rw_syn);
		CreatingThread_Synchronized t4=new CreatingThread_Synchronized(rw_syn);
		
		t3.start();
		t4.start();
		
		try {
			t3.join();
			t4.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
