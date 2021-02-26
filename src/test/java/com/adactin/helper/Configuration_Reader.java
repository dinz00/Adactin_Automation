package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\dines\\eclipse-workspace\\Adactin_Automation\\src\\test\\java\\com\\adactin\\properities\\Configuration.Properties");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
		p.load(fis);
	}

	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getusername() {
		String username = p.getProperty("db_username");
		return username;
	}

	public String getpassword() {
		String password = p.getProperty("db_Password");
		return password;

	}
}
