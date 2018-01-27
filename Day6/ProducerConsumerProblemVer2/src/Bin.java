
//Any class that has synchronized method or block, its a thread safe class
//Thread Safety comes with the cost of performance
public class Bin {
	private int data;
	private boolean available;

	public synchronized int getData() {
		while (!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		available = false;
		notifyAll();
		return data;
	}

	public void setData(int data) {
		synchronized (this) {
			if (!available) {
				this.data = data;
				available = true;
				notifyAll();
			}
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
