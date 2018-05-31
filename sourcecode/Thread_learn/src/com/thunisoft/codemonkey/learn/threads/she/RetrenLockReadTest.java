package com.thunisoft.codemonkey.learn.threads.she;

import java.util.concurrent.locks.Lock;

public class RetrenLockReadTest implements Runnable {
	private Lock lock;
	public RetrenLockReadTest(Lock lock) {
		this.lock = lock;
	}
	@Override
	public void run() {


			try {
				lock.tryLock();
				while (true) {
					System.out.println("iam codemonkey;"
							+ Thread.currentThread().getId());
					Thread.sleep(2000);
				}
			} catch (Exception e) {

			} finally {
				lock.unlock();
			}
		}

}
