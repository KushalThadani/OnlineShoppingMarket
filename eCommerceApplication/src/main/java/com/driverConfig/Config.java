package com.driverConfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class Config {
	private static HashMap<String,String> map = new HashMap<String,String>();

	public HashMap<String,String> config_data(){
		return map;
	}

	public  Config() throws IOException {
		try {
			Properties pro = new Properties();
			FileInputStream stream = new FileInputStream("config.properties");
			pro.load(stream);
			Enumeration<?> e = pro.propertyNames();
			while(e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = pro.getProperty(key);
				map.put(key, value);
			}// End while loop

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// End constructor
}

