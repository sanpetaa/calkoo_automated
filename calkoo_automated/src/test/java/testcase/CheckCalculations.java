package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.Calculation;
import utilities.Tools;

public class CheckCalculations extends BaseTest {

	// Testing the actual calculations
	// You can set any pricewithoutvat in config.properties
	// You can set any VATrate% per TestCases

	// User fill the NETPRICE and validate the result in case of 20% VAT rate
	@Test
	public static void checkFranceCalculations() throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("Country"))).click();
		driver.findElement(By.xpath(loc.getProperty("France"))).click();
		System.out.println("France: ");
		List<WebElement> elements = driver.findElements(By.xpath(loc.getProperty("forVATcycle")));
		for (WebElement tempEle : elements) {
			tempEle.click();
			Tools.getdynamicVATpct();
			Tools.clickOnF1();
			Calculation.comparePricesFilledByNetPrice();
			Tools.clickOnF2();
			Calculation.comparePricesFilledByVatSum();
			Tools.clickOnF3();
			Calculation.comparePricesFilledByPrice();
		}

	}

	@Test
	// User fill the NETPRICE and validate the result in case of any
	public static void checkItalyCalculations() throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("Country"))).click();
		driver.findElement(By.xpath(loc.getProperty("Italy"))).click();
		System.out.println("Italy: ");
		List<WebElement> elements = driver.findElements(By.xpath(loc.getProperty("forVATcycle")));
		for (WebElement tempEle : elements) {
			tempEle.click();
			Tools.getdynamicVATpct();
			Tools.clickOnF1();
			Calculation.comparePricesFilledByNetPrice();
			Tools.clickOnF2();
			Calculation.comparePricesFilledByVatSum();
			Tools.clickOnF3();
			Calculation.comparePricesFilledByPrice();
		}

	}

	@Test
	// User fill the NETPRICE and validate the result in case of 20% VAT rate
	public static void checkUKCalculations() throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("Country"))).click();
		driver.findElement(By.xpath(loc.getProperty("UK"))).click();
		System.out.println("United Kingdom:");
		List<WebElement> elements = driver.findElements(By.xpath(loc.getProperty("forVATcycle")));
		for (WebElement tempEle : elements) {
			tempEle.click();
			Tools.getdynamicVATpct();
			Tools.clickOnF1();
			Calculation.comparePricesFilledByNetPrice();
			Tools.clickOnF2();
			Calculation.comparePricesFilledByVatSum();
			Tools.clickOnF3();
			Calculation.comparePricesFilledByPrice();
		}
	}
}
