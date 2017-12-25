package com.lhc.excise;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TestCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int i = 0;
		for(; i < 10 ; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		return i;
	}
	
	public static void main(String[] args) {
		
		TestCallable testCallable = new TestCallable();
		FutureTask<Integer> task = new FutureTask<Integer>(testCallable);
		
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(Thread.currentThread().getName() + "��ѭ�h׃��I��ֵ��" + i);
			if (i == 5){
				new Thread(task,"�з���ֵ�ľQ��").start();
			}
		}
		try {
			System.out.println("��xiancheng�ķ���ֵ��" + task.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
