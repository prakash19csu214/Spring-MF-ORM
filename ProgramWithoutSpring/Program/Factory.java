package Program;

import java.util.ResourceBundle;

public class Factory {
	private static ResourceBundle rb = ResourceBundle.getBundle("config");
	
	private Factory() {
		
	}
	static Producer getObject() {
		Object object = null;
		String className = rb.getString("classname");
		try {
			object = Class.forName(className).getDeclaredConstructor().newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return (Producer)object;
	}

}
