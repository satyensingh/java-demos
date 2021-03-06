
public class Test {

	public static void main(String[] args) {
		
		Bin bin = new Bin();
		Producer producerJob = new Producer(bin);
		Consumer consumerJob = new Consumer(bin);
		
		Thread producer = new Thread(producerJob, "Producer Thread");
		Thread consumer = new Thread(consumerJob, "Consumer Thread");
		
		//start() informs the JVM to call run in a separate call stack
		producer.start();//Do not call run()
		consumer.start();//Do not call run()
	}

}
