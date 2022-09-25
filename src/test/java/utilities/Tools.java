package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class Tools extends BaseTest {

	// clear the price SendKeys
	public static void clearWebField(WebElement element) {
		while (!element.getAttribute("value").equals("")) {
			element.sendKeys(Keys.BACK_SPACE);
		}
	}

	public static void clickOnF1() {
		driver.findElement(By.xpath(loc.getProperty("F1"))).click();
		WebElement NetPrice = driver.findElement(By.xpath(loc.getProperty("NetPrice")));
		clearWebField(NetPrice);
	}

	public static void clickOnF2() {
		driver.findElement(By.xpath(loc.getProperty("F2"))).click();
		WebElement VATsum = driver.findElement(By.xpath(loc.getProperty("VatSum")));
		clearWebField(VATsum);
	}

	public static void clickOnF3() {
		driver.findElement(By.xpath(loc.getProperty("F3"))).click();
		WebElement Price = driver.findElement(By.xpath(loc.getProperty("Price")));
		clearWebField(Price);
	}

	public static void getdynamicVATpct() {
		String path = System.getProperty("user.dir");
		
		// get element VATpct2
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		String s_VATpct2 = VATpct2.getAttribute("value");

		try {
			InputStream in = new FileInputStream(path+"/src/test/resources/configfiles/config.properties");
			prop.load(in);
		} catch (IOException ex) {
			System.out.println(ex);
		}
		// Setting the value to our properties file
		prop.setProperty("dynamicVATpct", s_VATpct2.substring(s_VATpct2.length() - 7));
		// Getting the value from our properties file

		try {
			prop.store(new FileOutputStream(path+"/src/test/resources/configfiles/config.properties"),
					null);
		} catch (IOException ex) {
			System.out.println(ex);
		}

		// get element VATpct1
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		String s_VATpct1 = VATpct1.getAttribute("value");

		try {
			InputStream in = new FileInputStream(path+"/src/test/resources/configfiles/config.properties");
			prop.load(in);
		} catch (IOException ex) {
			System.out.println(ex);
		}
		// Setting the value to our properties file
		prop.setProperty("dynamicVATpct2", s_VATpct1.substring(s_VATpct1.length() - 7));
		// Getting the value from our properties file

		try {
			prop.store(new FileOutputStream(path+"/src/test/resources/configfiles/config.properties"),
					null);
		} catch (IOException ex) {
			System.out.println(ex);
		}

	}
}
