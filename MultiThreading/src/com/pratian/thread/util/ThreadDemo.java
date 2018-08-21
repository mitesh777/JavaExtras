package com.pratian.thread.util;

public class ThreadDemo {
	public static void main(String[] args) {
		SimpleThread thread1 = new SimpleThread("Thread 1");
		SimpleThread thread2 = new SimpleThread("Thread 2");
		SimpleThread thread3 = new SimpleThread("Thread 3");
		SimpleThread thread4 = new SimpleThread("Thread 4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		System.out.println(Thread.currentThread().getName()+" has finished its task. finishing");
	}
}
