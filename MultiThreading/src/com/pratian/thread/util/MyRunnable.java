package com.pratian.thread.util;

public class MyRunnable implements Runnable {

	private Thread thread;
	
	public MyRunnable() {
		thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=100;i>0;i--) {
			System.out.println(Thread.currentThread().getName() + " : "+i);
		}
	}
	
}
