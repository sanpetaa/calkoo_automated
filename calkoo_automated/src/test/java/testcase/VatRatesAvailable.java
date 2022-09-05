package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import base.GetVATpctComparison;

public class VatRatesAvailable extends BaseTest {

	@Test
	// User choose all the valid VAT rate for the selected country and compare the
	// multipliers --> FRANCE
	public static void checkFranceVATrates() throws InterruptedException {
		System.out.println("France VAT rates and multipliers: ");
		driver.findElement(By.xpath(loc.getProperty("Country"))).click();
		driver.findElement(By.xpath(loc.getProperty("France"))).click();
		driver.findElement(By.xpath(loc.getProperty("VATrate2.1"))).click();
		GetVATpctComparison.getVATpctComparison2point1();
		driver.findElement(By.xpath(loc.getProperty("VATrate5.5"))).click();
		GetVATpctComparison.getVATpctComparison5point5();
		driver.findElement(By.xpath(loc.getProperty("VATrate10"))).click();
		GetVATpctComparison.getVATpctComparison10();
		driver.findElement(By.xpath(loc.getProperty("VATrate20"))).click();
		GetVATpctComparison.getVATpctComparison20();
		System.out.println("\n");
	}

	@Test
	// User choose all the valid VAT rate for the selected country and compare the
	// multipliers --> UNITED KINGDOM
	public static void checkUKVATrates() {
		System.out.println("UK VAT rates and multipliers: ");
		driver.findElement(By.xpath(loc.getProperty("Country"))).click();
		driver.findElement(By.xpath(loc.getProperty("UK"))).click();
		driver.findElement(By.xpath(loc.getProperty("VATrate5"))).click();
		GetVATpctComparison.getVATpctComparison5();
		driver.findElement(By.xpath(loc.getProperty("VATrate20"))).click();
		GetVATpctComparison.getVATpctComparison20();
		System.out.println("\n");

	}

	@Test
	//// User choose all the valid VAT rate for the selected country and compare the
	//// multipliers --> ITALY
	public static void checkItalyVATrates() {
		System.out.println("Italy VAT rates and multipliers: ");
		driver.findElement(By.xpath(loc.getProperty("Country"))).click();
		driver.findElement(By.xpath(loc.getProperty("Italy"))).click();
		driver.findElement(By.xpath(loc.getProperty("VATrate4"))).click();
		GetVATpctComparison.getVATpctComparison4();
		driver.findElement(By.xpath(loc.getProperty("VATrate5"))).click();
		GetVATpctComparison.getVATpctComparison5();
		driver.findElement(By.xpath(loc.getProperty("VATrate10"))).click();
		GetVATpctComparison.getVATpctComparison10();
		driver.findElement(By.xpath(loc.getProperty("VATrate22"))).click();
		GetVATpctComparison.getVATpctComparison22();
		System.out.println("\n");

	}


}
