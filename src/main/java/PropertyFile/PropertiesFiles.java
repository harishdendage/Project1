package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFiles {
	public static String projectpath=System.getProperty("user.dir");
	static Properties prop=new Properties();
	
	
	public static void main(String[] args) {
		getproperties();
		setproperties();
		getproperties();

	}
	public static void getproperties() {

		try {
			
			InputStream input=new FileInputStream(projectpath+"/src/main/java/PropertyFile/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			TestNGDemo.browserName= browser;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

			e.printStackTrace();
		}

	}
	public static void setproperties() {

		try {
			OutputStream output=new FileOutputStream(projectpath+"/src/main/java/PropertyFile/config.properties");
		prop.setProperty("browser","chrome");
		prop.store(output, null);
		
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
			e.printStackTrace();
		}


	}

}
