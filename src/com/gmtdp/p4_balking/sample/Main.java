package com.gmtdp.p4_balking.sample;

public class Main {

	public static void main(String[] args) {
		Data data = new Data("static/data.txt", "(empty)");
		new ChangerThread("ChangerThread", data).start();
		new SaverThread("SaverThread", data).start();
	}

}
