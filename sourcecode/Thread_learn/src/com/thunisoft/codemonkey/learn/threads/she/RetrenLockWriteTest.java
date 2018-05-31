package com.thunisoft.codemonkey.learn.threads.she;

import java.util.concurrent.locks.Lock;

public class RetrenLockWriteTest implements Runnable {
	private Lock lock;

	public RetrenLockWriteTest(Lock lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
			try {
				
				while (true) {
					System.out.println("iam lonelyboy;"
							+ Thread.currentThread().getId());
					Thread.sleep(2000);
				}
			} catch (Exception e) {
				
			} finally {
				lock.unlock();
			}
			
	}

}
