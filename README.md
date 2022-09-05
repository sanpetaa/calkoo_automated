<listener class-name="org.uncommons.reportng.HTMLReporter" />
	<listener class-name="common.Listeners" />






      <class name="testcase.CheckCalculations"/>




		if (VATpct2.getAttribute("value").equals("× 0.021000")) {





package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(
				"C://Automation/Workspace/GlobalBlueHomeWork/src/test/resources/configfiles/config.properties");

		Properties p = new Properties();

		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("url"));
	}

}
