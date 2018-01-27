
public class Producer implements Runnable {
	private Bin bin;
	
	public Producer(Bin bin) {
		super();
		this.bin = bin;
	}

	@Override
	public void run() {
		for(int i=0;i< 10;i++) {
			bin.setData(i);
			System.out.println("Producer puts "+i);
		}
		
	}

}
