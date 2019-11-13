package com.nay.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class EnvironmentVariables {

	public static void main(String[] args) throws IOException {
		File file = new File("E:/Hadoop/2019年大二上学期/Environmental variable.txt");
		String cache = "";
		for(Map.Entry entry :System.getenv().entrySet()){
			cache += entry.getKey().toString() + ":" + entry.getValue() + "\r\n"; 
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(cache.getBytes());
		fos.close();
	}
}
