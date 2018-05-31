package com.thunisoft.codemonkey.learn.threads.inteface;

import com.thunisoft.codemonkey.learn.threads.she.Whosheis;

/**
 * @author Administrator
 *
 */
public class DoNotLoveThread implements Runnable {

	private Whosheis areUhu;

	public DoNotLoveThread() {
		super();
	}

	public DoNotLoveThread(Whosheis she) {
		this.areUhu = she;
	}

	@Override
	public void run() {
		areUhu.knowNothing(1);
	}

}
