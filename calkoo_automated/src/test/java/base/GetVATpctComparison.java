package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetVATpctComparison extends BaseTest {

	public static void getVATpctComparison2point1() {
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.021000")) {
			System.out.println("2.1% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("2.1% VAT rate is NOT equal to the Price without VAT multiplier");
			org.testng.Assert.fail();
		}
		if (VATpct1.getAttribute("value").equals("× 0.020568")) {
			System.out.println("2.1% VAT rate is equal to the Price include VAT multiplier");
		} else {
			System.out.println("2.1% VAT rate is NOT equal to the Price include VAT multiplier");
			org.testng.Assert.fail();
		}
	}

	public static void getVATpctComparison4() {
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.040000")) {
			System.out.println("4% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("4% VAT rate is NOT equal to the Price without VAT multiplier");
			org.testng.Assert.fail();
		}
		if (VATpct1.getAttribute("value").equals("× 0.038462")) {
			System.out.println("4% VAT rate is equal to the Price include VAT multiplier");
		} else {
			System.out.println("4% VAT rate is NOT equal to the Price include VAT multiplier");
			org.testng.Assert.fail();
		}
	}

	public static void getVATpctComparison5() {
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.050000")) {
			System.out.println("5% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("5% VAT rate is NOT equal to the Price without VAT multiplier");
			org.testng.Assert.fail();
		}
		if (VATpct1.getAttribute("value").equals("× 0.047619")) {
			System.out.println("5% VAT rate is equal to the Price include VAT multiplier");
		} else {
			System.out.println("5% VAT rate is NOT equal to the Price include VAT multiplier");
			org.testng.Assert.fail();
		}
	}

	public static void getVATpctComparison5point5() {
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.055000")) {
			System.out.println("5.5% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("5.5% VAT rate is NOT equal to the Price without VAT multiplier");
			org.testng.Assert.fail();}
		if (VATpct1.getAttribute("value").equals("× 0.052133")) {
			System.out.println("5.5% VAT rate is equal to the Price include VAT multiplier");
		} else {
			System.out.println("5.5% VAT rate is NOT equal to the Price include VAT multiplier");
			org.testng.Assert.fail();
		}
	}

	public static void getVATpctComparison10() {
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.100000")) {
			System.out.println("10% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("10% VAT rate is NOT equal to the Price without VAT multiplier");
			org.testng.Assert.fail();
		}
		if (VATpct1.getAttribute("value").equals("× 0.090909")) {
			System.out.println("10% VAT rate is equal to the Price include VAT multiplier");
		} else {
			System.out.println("10% VAT rate is NOT equal to the Price include VAT multiplier");
			org.testng.Assert.fail();
		}
	}

	public static void getVATpctComparison20() {
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.200000")) {
			System.out.println("20% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("20% VAT rate is NOT equal to the Price without VAT multiplier");
			org.testng.Assert.fail();
		}
		if (VATpct1.getAttribute("value").equals("× 0.166667")) {
			System.out.println("20% VAT rate is equal to the Price include VAT multiplier");
		} else {
			System.out.println("20% VAT rate is NOT equal to the Price include VAT multiplier");
			org.testng.Assert.fail();
		}
	}

	public static void getVATpctComparison22() {
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.220000")) {
			System.out.println("22% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("22% VAT rate is NOT equal to the Price without VAT multiplier");
			org.testng.Assert.fail();
		}
		if (VATpct1.getAttribute("value").equals("× 0.180328")) {
			System.out.println("22% VAT rate is equal to the Price include VAT multiplier");
		} else {
			System.out.println("22% VAT rate is NOT equal to the Price include VAT multiplier");
			org.testng.Assert.fail();
		}
	}
	
}
