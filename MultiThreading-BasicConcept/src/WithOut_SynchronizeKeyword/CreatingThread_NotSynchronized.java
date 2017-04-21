package WithOut_SynchronizeKeyword;

public class CreatingThread_NotSynchronized extends Thread
{
	
	ReadWriter_NotSynchronized w;
	

	public CreatingThread_NotSynchronized(ReadWriter_NotSynchronized w) {
		
		this.w = w;
	}
	
	
	
	



	@Override
	public void run()
	{
		w.getReaderWriter();
	}
	
	
}
