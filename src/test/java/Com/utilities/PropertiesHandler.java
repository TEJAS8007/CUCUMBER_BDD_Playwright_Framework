package Com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandler {

	String path="src//test//resources//Config//Config.properties";
	Properties pro;
	public Properties init_Prop() {
		
		try {
			FileInputStream file=new FileInputStream(path);
			pro=new Properties();
			pro.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pro;
	}
}
