package com.lhc.excise;

public class TestRunnable implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i ++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			TestRunnable testRunnable  =  new TestRunnable();
			new Thread(testRunnable,"新綫程1").start();
			new Thread(testRunnable,"新綫程2").start();
		}
	}

}
