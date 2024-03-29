package com.java;

public class SampleDemo implements Runnable{
	private Thread t;
	private String threadName;
	
	SampleDemo(String threadName){
		this.threadName = threadName;
	}
	
	public void run() {
		while(true) {
			System.out.print(threadName);
		}
	}
	
	public void start() {
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
