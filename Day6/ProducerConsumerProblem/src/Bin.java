
public class Bin {
	private int data;

	public int getData() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return data;
	}

	public void setData(int data) {
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.data = data;
	}
	
	
}
