package com.thunisoft.codemonkey.learn.threads.extend;

import com.thunisoft.codemonkey.learn.threads.she.Whosheis;

public class LoveThread extends Thread{

	private Whosheis areUhu ;

	public LoveThread(){
		super();
	}
	
	public LoveThread(Whosheis she){
		this.areUhu = she;
		
	}
	
	@Override
	public void run(){
		areUhu.knowNothing(0);
	}
}
