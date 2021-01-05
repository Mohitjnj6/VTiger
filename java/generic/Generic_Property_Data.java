package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Generic_Property_Data 
{
	public static String test1(String path, String key) throws Exception
	{
	Properties p = new Properties();
	p.load(new FileInputStream(path));
	String value = p.getProperty(key);
	System.out.println(value);
	return value;
	}
}
