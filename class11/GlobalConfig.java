package class11;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalConfig {
	private static final GlobalConfig INSTANCE = new GlobalConfig(); //静态常量
	private Properties properties = new Properties();
	
	private GlobalConfig() {
		try {
			//加载配置信息
			InputStream in = getClass().getResourceAsStream("myapp.properites");
			properties.load(in);
			in.close();
			
		}catch(IOException e) {
			throw new RuntimeException("加载信息失败");
		}
	}
	public static GlobalConfig getInstance() {
		return INSTANCE;
		}
	public Properties getProperties() { 
		return properties; 
	}
}
