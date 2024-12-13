package com.gmtdp.p11_threadSpecificStorage.sample1;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Log {
	private static PrintWriter writer = null;
	
	static {
		try {
			writer = new PrintWriter(new FileWriter("static/log.txt"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void println(String s) {
		writer.println(s);
	}
	
	public static void close() {
		writer.println("==== End of log ====");
		writer.close();
	}
}
