package WithOut_SynchronizeKeyword;

public class CreatingThread_Synchronized extends Thread{
	ReaderWriter_Synchronized rw_syn;
		public CreatingThread_Synchronized(ReaderWriter_Synchronized rw_syn) {
		
		this.rw_syn = rw_syn;
	}
		public void run()
		{
			rw_syn.getReadderWriter();
		}

}
