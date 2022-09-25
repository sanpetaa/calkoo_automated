package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import base.BaseTest;

public class GetVATpctComparison extends BaseTest {

	public static void getVATpctComparison2point1() {
		//soft assert
		SoftAssert softassert = new SoftAssert();
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.021000")) {
			System.out.println("2.1% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("2.1% VAT rate is NOT equal to the Price without VAT multiplier");
			softassert.assertEquals(VATpct2,"× 0.021000", "ERROR: 2.1% VAT rate is NOT equal to the Price without VAT multiplier");
		}
		if (VATpct1.getAttribute("value").equals("× 0.020568")) {
			System.out.println("2.1% VAT rate is equal to the Price including VAT multiplier");
		} else {
			System.out.println("2.1% VAT rate is NOT equal to the Price including VAT multiplier");
			softassert.assertEquals(VATpct1,"× 0.020568", "ERROR: 2.1% VAT rate is NOT equal to the Price including VAT multiplier");
		}
		softassert.assertAll();
	}

	public static void getVATpctComparison4() {
		//soft assert
		SoftAssert softassert = new SoftAssert();
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.040000")) {
			System.out.println("4% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("4% VAT rate is NOT equal to the Price without VAT multiplier");
			softassert.assertEquals(VATpct2,"× 0.040000", "ERROR: 4% VAT rate is NOT equal to the Price without VAT multiplier");
		}
		if (VATpct1.getAttribute("value").equals("× 0.038462")) {
			System.out.println("4% VAT rate is equal to the Price including VAT multiplier");
		} else {
			System.out.println("4% VAT rate is NOT equal to the Price including VAT multiplier");
			softassert.assertEquals(VATpct1,"× 0.038462", "4% VAT rate is NOT equal to the Price including VAT multiplier");
		}
		softassert.assertAll();
	}

	public static void getVATpctComparison5() {
		//soft assert
		SoftAssert softassert = new SoftAssert();
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.050000")) {
			System.out.println("5% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("5% VAT rate is NOT equal to the Price without VAT multiplier");
			softassert.assertEquals(VATpct2,"× 0.050000", "5% VAT rate is NOT equal to the Price without VAT multiplier");
		}
		if (VATpct1.getAttribute("value").equals("× 0.047619")) {
			System.out.println("5% VAT rate is equal to the Price including VAT multiplier");
		} else {
			System.out.println("5% VAT rate is NOT equal to the Price including VAT multiplier");
			softassert.assertEquals(VATpct1,"× 0.047619", "5% VAT rate is NOT equal to the Price including VAT multiplier");
		}
		softassert.assertAll();
	}

	public static void getVATpctComparison5point5() {
		//soft assert
		SoftAssert softassert = new SoftAssert();
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.055000")) {
			System.out.println("5.5% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("5.5% VAT rate is NOT equal to the Price without VAT multiplier");
			softassert.assertEquals(VATpct2,"× 0.055000", "5.5% VAT rate is NOT equal to the Price without VAT multiplier");
		}
		if (VATpct1.getAttribute("value").equals("× 0.052133")) {
			System.out.println("5.5% VAT rate is equal to the Price including VAT multiplier");
		} else {
			System.out.println("5.5% VAT rate is NOT equal to the Price including VAT multiplier");
			softassert.assertEquals(VATpct1,"× 0.052133", "5.5% VAT rate is NOT equal to the Price including VAT multiplier");
		}
		softassert.assertAll();
	}

	public static void getVATpctComparison10() {
		//soft assert
		SoftAssert softassert = new SoftAssert();
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.100000")) {
			System.out.println("10% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("10% VAT rate is NOT equal to the Price without VAT multiplier");
			softassert.assertEquals(VATpct2,"× 0.100000", "10% VAT rate is NOT equal to the Price without VAT multiplier");
		}
		if (VATpct1.getAttribute("value").equals("× 0.090909")) {
			System.out.println("10% VAT rate is equal to the Price including VAT multiplier");
		} else {
			System.out.println("10% VAT rate is NOT equal to the Price including VAT multiplier");
			softassert.assertEquals(VATpct1,"× 0.090909", "10% VAT rate is NOT equal to the Price including VAT multiplier");
		}
		softassert.assertAll();
	}

	public static void getVATpctComparison20() {
		//soft assert
		SoftAssert softassert = new SoftAssert();
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.200000")) {
			System.out.println("20% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("20% VAT rate is NOT equal to the Price without VAT multiplier");
			softassert.assertEquals(VATpct2,"× 0.200000", "20% VAT rate is NOT equal to the Price without VAT multiplier");
		}
		if (VATpct1.getAttribute("value").equals("× 0.166667")) {
			System.out.println("20% VAT rate is equal to the Price including VAT multiplier");
		} else {
			System.out.println("20% VAT rate is NOT equal to the Price including VAT multiplier");
			softassert.assertEquals(VATpct1,"× 0.166667", "20% VAT rate is NOT equal to the Price including VAT multiplier");
		}
		softassert.assertAll();
	}

	public static void getVATpctComparison22() {
		//soft assert
		SoftAssert softassert = new SoftAssert();
		WebElement VATpct2 = driver.findElement(By.xpath(loc.getProperty("VATpct2")));
		// System.out.println(VATpct2.getAttribute("value"));
		WebElement VATpct1 = driver.findElement(By.xpath(loc.getProperty("VATpct1")));
		// System.out.println(VATpct1.getAttribute("value"));

		if (VATpct2.getAttribute("value").equals("× 0.220000")) {
			System.out.println("22% VAT rate is equal to the Price without VAT multiplier");
		} else {
			System.out.println("22% VAT rate is NOT equal to the Price without VAT multiplier");
			softassert.assertEquals(VATpct2,"× 0.220000", "22% VAT rate is NOT equal to the Price without VAT multiplier");
		}
		if (VATpct1.getAttribute("value").equals("× 0.180328")) {
			System.out.println("22% VAT rate is equal to the Price including VAT multiplier");
		} else {
			System.out.println("22% VAT rate is NOT equal to the Price including VAT multiplier");
			softassert.assertEquals(VATpct1,"× 0.180328", "22% VAT rate is NOT equal to the Price including VAT multiplier");
		}
		softassert.assertAll();
	}
	
}
