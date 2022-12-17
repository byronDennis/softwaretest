package utilities;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*got by rightclicking config.properies FileReader fr=new FileReader("C:\\Users\\stevemubiru\\eclipse-workspace\\TestAutomation\\src\\test\\resources\\configfiles\\config.properties");*/
FileReader fr=new FileReader(System.getProperty("user+dir")+"\\\\src\\\\test\\\\resources\\\\configfiles\\\\config.properties");		
Properties p=new Properties();
p.load(fr);
	}

}
