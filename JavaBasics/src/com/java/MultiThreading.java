package com.java;

public class MultiThreading implements Runnable {
	
	Thread tPing, tPong;
	
	public MultiThreading() {
		tPing = new Thread(this);
		tPing.setName("PING");
		tPing.start();
		
		tPong = new Thread(this);
		tPong.setName("PONG");
		tPong.start();
	}
	
	public void run() {
		Thread currentThread = Thread.currentThread();
		if(currentThread.getName().equals("PING")) {
			for(int i=0; i<10; i++)
			{
				System.out.println("PING");
				try {
					Thread.sleep(300);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new MultiThreading();
	}

}
