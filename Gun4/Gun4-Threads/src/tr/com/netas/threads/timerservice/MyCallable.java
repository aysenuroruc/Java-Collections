package tr.com.netas.threads.timerservice;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(1000*5);
		return "Bitti";
	}

}
