package com.thunisoft.codemonkey.learn.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.thunisoft.codemonkey.learn.threads.she.RetrenLockReadTest;
import com.thunisoft.codemonkey.learn.threads.she.RetrenLockWriteTest;

public class Test {

	public static void main(String[] args) throws InterruptedException {
        // System.out.println("没事多学习");
		// Whosheis hu = new Whosheis();
		//
		// LoveThread loveThread = new LoveThread(hu);
		// Thread unloveThread = new Thread(new DoNotLoveThread(hu));
		// loveThread.start();
		// unloveThread.start();
		Lock lock = new ReentrantLock(false);
		RetrenLockReadTest readt = new RetrenLockReadTest(lock);
		RetrenLockReadTest readt2 = new RetrenLockReadTest(lock);
		new Thread(readt).start();
		new Thread(readt2).start();
		RetrenLockWriteTest write = new RetrenLockWriteTest(lock);
		Thread.sleep(1000);
		new Thread(write).start();
	}

}
