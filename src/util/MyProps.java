package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyProps {
	private static MyProps _properties;
	private final String FILE_NAME = "all.properties";
	private java.util.Properties prop;
	
	private MyProps(){
		prop = new java.util.Properties();
		
		String path = this.getClass().getName();
		path = path.replace(".", "/");
		path = path.substring(0, path.lastIndexOf("/"));
		
		try {
			prop.load(new FileInputStream(path+FILE_NAME));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getProperty(String name){
		return prop.getProperty(name);
	}
	
	public long getLong(String name){
		return Long.parseLong(prop.getProperty(name));
	}
	
	public int getInt(String name){
		return Integer.parseInt(prop.getProperty(name));
	}
	
	public static MyProps getInst(){
		if (_properties==null){
			_properties=new MyProps();
		}
		
		return _properties;
	}
	
	/* --------CONSTS---------------- */
	public static final String MAX_X = "max_x";
	public static final String MAX_Y = "max_y";

	
}
