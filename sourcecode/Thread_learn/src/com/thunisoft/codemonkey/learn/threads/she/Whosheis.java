package com.thunisoft.codemonkey.learn.threads.she;

public class Whosheis {


	public synchronized void knowNothing(int index) {
		synchronized (this) {
			for (int loop = 0; loop < 100; loop++) {
				if (index == 0) {
					System.out.println("she is hu");
				} else {
					System.out.println("she is not");
				}
			}
		}

	}
}
