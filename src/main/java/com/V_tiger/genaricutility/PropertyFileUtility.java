package com.V_tiger.genaricutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
public String readDataFromPropertyFile(String key) throws IOException {
	FileInputStream fisp = new FileInputStream("C:\\Users\\holinamanjunath\\Desktop\\Javaprograming\\HybridFrameWork\\src\\test\\resources\\userFile.properties");
	Properties p = new Properties();
	p.load(fisp);
	return p.getProperty(key);
	
}

	
	
}
