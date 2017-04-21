package WithOut_SynchronizeKeyword;

public class ReadWriter_NotSynchronized {
	
	private ReadWrite rw;
	
	
	public ReadWriter_NotSynchronized(ReadWrite rw) {
		
		this.rw = rw;
	}

	// this method should be synchronized
	public void getReaderWriter()
	{
	
	for(int i=0;i<3;i++)
	{
		rw.setI(i);
		System.out.println(rw.getI());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
