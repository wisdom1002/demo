package com.lhc.excise;

public class TestThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 0 ; i <= 100 ; i++){
			System.out.println(getName() +  " " + i);
		}
	    
	}

	/**
	 * 
	 * ���ڲ���
	 * @author luhuaicai
	 * @since 2017��2��14��
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0 ; i <= 100 ; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				new TestThread().start();
				new TestThread().start();
			}
		}
	}

}
