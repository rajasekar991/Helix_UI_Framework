package com.helix.team.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	
	/*
	 * Author: Rajesh Matadh
	 * Purpuse: This method is used to get values from config file
	 */
	public Properties initiateProp()
	{
		prop = new Properties();
		try {
			FileInputStream fileip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(fileip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	
}
