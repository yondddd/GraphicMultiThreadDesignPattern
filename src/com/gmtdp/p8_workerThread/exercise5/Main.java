package com.gmtdp.p8_workerThread.exercise5;

public class Main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ":BEGIN");
		new MyFrame();
		System.out.println(Thread.currentThread().getName() + ":END");
	}
}
