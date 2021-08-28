package Utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyHandler {
	private static PropertyHandler instance = null;

	private Properties props = null;

	private PropertyHandler() throws IOException {
		FileReader reader = new FileReader("objects/Xpaths.properties");
		this.props = new Properties();
		props.load(reader);
	}

	public static synchronized PropertyHandler getInstance() throws IOException {
		if (instance == null)
			instance = new PropertyHandler();
		return instance;
	}

	public String getValue(String propKey) {
		return this.props.getProperty(propKey);
	}

}
