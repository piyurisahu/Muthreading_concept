package WithOut_SynchronizeKeyword;

public class ReaderWriter_Synchronized {

private ReadWrite rw;
	
	
	public ReaderWriter_Synchronized(ReadWrite rw) {
		
		this.rw = rw;
	}

	// this method should be synchronized
	synchronized public void getReadderWriter()
	{
	
	for(int i=0;i<3;i++)
	{
		rw.setI(i);
		System.out.println(rw.getI());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
