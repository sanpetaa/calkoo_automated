package base;

import org.apache.commons.math3.util.Precision;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Calculation extends BaseTest {

	public static void comparePricesFilledByNetPrice() {

		// add X to the NETPRICE
		WebElement NetPrice = driver.findElement(By.xpath(loc.getProperty("NetPrice")));
		NetPrice.sendKeys(prop.getProperty("netprice"));
		// get VATSUM calculation from site
		WebElement VATsum = driver.findElement(By.xpath(loc.getProperty("VatSum")));
		String vatsum = VATsum.getAttribute("value");
		double vatsumfromsite = Double.parseDouble(vatsum);
		// get PRICE calculation from site
		WebElement Price = driver.findElement(By.xpath(loc.getProperty("Price")));
		String price = Price.getAttribute("value");
		double pricefromsite = Double.parseDouble(price);

		// local prices
		double pwv = Double.parseDouble(prop.getProperty("netprice"));
		double localNetprice = Precision.round(pwv, 2);

		double vat = localNetprice * Double.parseDouble(prop.getProperty("dynamicVATpct"));
		double localVATsum = Precision.round(vat, 2);

		double pit = pwv + localVATsum;
		double localPrice = Precision.round(pit, 2);

		// compare prices from the site vs prices calculated
		if (vatsumfromsite == localVATsum) {
			System.out.println("The Value-Added Tax from the site " + vatsumfromsite + " is equal to the calculated "
					+ localVATsum);
		} else {
			System.out.println("The Value-Added Tax from the site " + vatsumfromsite
					+ " is NOT equal to the calculated " + localVATsum);
			org.testng.Assert.fail();
		}
		;

		// compare prices from the site vs prices calculated
		if (pricefromsite == localPrice) {
			System.out.println(
					"Price incl. Tax from the site " + pricefromsite + " is equal to the calculated " + localPrice);
		} else {
			System.out.println("Price incl. Tax from the site " + pricefromsite + "  is NOT equal to the calculated "
					+ localPrice);
			org.testng.Assert.fail();
		}
		;

		// get the pie chart elements of the higher percentage

		WebElement HigherPieChart = driver.findElement(By.xpath(loc.getProperty("higherpiechartdata")));
		String higherpiechartdata = HigherPieChart.getText();
		higherpiechartdata = higherpiechartdata.replaceAll("%", "");
		double higherpiechartfromsite = Double.parseDouble(higherpiechartdata);
		// System.out.println("The higher value of the pie chart: " +
		// higherpiechartfromsite);

		// get the pie chart elements of the lower percentage
		/*
		 * WebElement LowerPieChart =
		 * driver.findElement(By.xpath(loc.getProperty("lowerpiechartdata"))); String
		 * lowerpiechartdata = LowerPieChart.getText(); lowerpiechartdata =
		 * lowerpiechartdata.replaceAll("%", ""); double lowerpiechartfromsite =
		 * Double.parseDouble(lowerpiechartdata);
		 * System.out.println("The lower value of the pie chart: " +
		 * lowerpiechartfromsite);
		 */

		double lpcfs = 100 - higherpiechartfromsite;
		double lowerpiechartfromsite = Precision.round(lpcfs, 1);
		// System.out.println("The lower value of the pie chart: " +
		// lowerpiechartfromsite);

		// local pie chart higher value
		double hpcfl = ((pwv / pit) * 100);
		double higherpiechartfromlocal = Precision.round(hpcfl, 1);

		// compare the local vs. from site higher pie chart value
		if (higherpiechartfromlocal == higherpiechartfromsite) {
			System.out.println("The higher local " + higherpiechartfromlocal
					+ " pie chart % is equal to the higher pie chart % from the site " + higherpiechartfromsite);
		} else {
			System.out.println("The higher local " + higherpiechartfromlocal
					+ " pie chart % is NOT equal to the higher pie chart % from the site " + higherpiechartfromsite);
			org.testng.Assert.fail();
		}

		// local pie chart lower value
		double lpcfl = ((vat / pit) * 100);
		double lowerpiechartfromlocal = Precision.round(lpcfl, 1);

		// compare the local vs. from site lower pie chart value
		if (lowerpiechartfromlocal == lowerpiechartfromsite) {
			System.out.println("The lower local " + lowerpiechartfromlocal
					+ " pie chart % is equal to the higher pie chart % from the site " + lowerpiechartfromsite);
		} else {
			System.out.println("The lower local " + lowerpiechartfromlocal
					+ " pie chart % is NOT equal to the higher pie chart % from the site " + lowerpiechartfromsite);
			org.testng.Assert.fail();
		}

		// delete NetPrice sendkey from field
		Tools.clearWebField(NetPrice);
		System.out.println("\n");
	}

	public static void comparePricesFilledByVatSum() {

		// add X for VATSUM
		WebElement VatSum = driver.findElement(By.xpath(loc.getProperty("VatSum")));
		VatSum.sendKeys(prop.getProperty("vatsum"));
		// get VATSUM calculation from site
		WebElement NetPrice = driver.findElement(By.xpath(loc.getProperty("NetPrice")));
		String netprice = NetPrice.getAttribute("value");
		double netpricefromsite = Double.parseDouble(netprice);
		// get PRICE calculation from site
		WebElement Price = driver.findElement(By.xpath(loc.getProperty("Price")));
		String price = Price.getAttribute("value");
		double pricefromsite = Double.parseDouble(price);

		// local prices
		double vat = Double.parseDouble(prop.getProperty("vatsum"));
		double localVATsum = Precision.round(vat, 2);

		double pwv = localVATsum / Double.parseDouble(prop.getProperty("dynamicVATpct"));
		double localNetPrice = Precision.round(pwv, 2);

		double pit = vat + localNetPrice;
		double localPrice = Precision.round(pit, 2);

		// compare prices from the site vs prices calculated
		if (netpricefromsite == localNetPrice) {
			System.out.println("The price without VAT from the site " + netpricefromsite
					+ " is equal to the calculated " + localNetPrice);
		} else {
			System.out.println("Theprice without VAT from the site " + netpricefromsite
					+ " is NOT equal to the calculated " + localVATsum);
			org.testng.Assert.fail();
		}
		;

		// compare prices from the site vs prices calculated
		if (pricefromsite == localPrice) {
			System.out.println(
					"Price incl. Tax from the site " + pricefromsite + " is equal to the calculated " + localPrice);
		} else {
			System.out.println("Price incl. Tax from the site " + pricefromsite + "  is NOT equal to the calculated "
					+ localPrice);
			org.testng.Assert.fail();
		}
		;

		// get the pie chart elements of the higher percentage

		WebElement HigherPieChart = driver.findElement(By.xpath(loc.getProperty("higherpiechartdata")));
		String higherpiechartdata = HigherPieChart.getText();
		higherpiechartdata = higherpiechartdata.replaceAll("%", "");
		double higherpiechartfromsite = Double.parseDouble(higherpiechartdata);
		// System.out.println("The higher value of the pie chart: " +
		// higherpiechartfromsite);

		// get the pie chart elements of the lower percentage
		/*
		 * WebElement LowerPieChart =
		 * driver.findElement(By.xpath(loc.getProperty("lowerpiechartdata"))); String
		 * lowerpiechartdata = LowerPieChart.getText(); lowerpiechartdata =
		 * lowerpiechartdata.replaceAll("%", ""); double lowerpiechartfromsite =
		 * Double.parseDouble(lowerpiechartdata);
		 * System.out.println("The lower value of the pie chart: " +
		 * lowerpiechartfromsite);
		 */

		double lpcfs = 100 - higherpiechartfromsite;
		double lowerpiechartfromsite = Precision.round(lpcfs, 1);
		// System.out.println("The lower value of the pie chart: " +
		// lowerpiechartfromsite);

		// local pie chart higher value
		double hpcfl = ((pwv / pit) * 100);
		double higherpiechartfromlocal = Precision.round(hpcfl, 1);

		// compare the local vs. from site higher pie chart value
		if (higherpiechartfromlocal == higherpiechartfromsite) {
			System.out.println("The higher local " + higherpiechartfromlocal
					+ " pie chart % is equal to the higher pie chart % from the site " + higherpiechartfromsite);
		} else {
			System.out.println("The higher local " + higherpiechartfromlocal
					+ " pie chart % is NOT equal to the higher pie chart % from the site " + higherpiechartfromsite);
			org.testng.Assert.fail();
		}

		// local pie chart lower value
		double lpcfl = ((vat / pit) * 100);
		double lowerpiechartfromlocal = Precision.round(lpcfl, 1);

		// compare the local vs. from site lower pie chart value
		if (lowerpiechartfromlocal == lowerpiechartfromsite) {
			System.out.println("The lower local " + lowerpiechartfromlocal
					+ " pie chart % is equal to the higher pie chart % from the site " + lowerpiechartfromsite);
		} else {
			System.out.println("The lower local " + lowerpiechartfromlocal
					+ " pie chart % is NOT equal to the higher pie chart % from the site " + lowerpiechartfromsite);
			org.testng.Assert.fail();
		}

		// delete NetPrice sendkeys
		Tools.clearWebField(VatSum);
		System.out.println("\n");
	}

	public static void comparePricesFilledByPrice() {

		// add X for Price
		WebElement Price = driver.findElement(By.xpath(loc.getProperty("Price")));
		Price.sendKeys(prop.getProperty("price"));
		// get VATSUM calculation from site
		WebElement NetPrice = driver.findElement(By.xpath(loc.getProperty("NetPrice")));
		String netprice = NetPrice.getAttribute("value");
		double netpricefromsite = Double.parseDouble(netprice);
		// get PRICE calculation from site
		WebElement VatSum = driver.findElement(By.xpath(loc.getProperty("VatSum")));
		String vatsum = VatSum.getAttribute("value");
		double vatsumfromsite = Double.parseDouble(vatsum);

		// local prices
		double pit = Double.parseDouble(prop.getProperty("price"));
		double localPrice = Precision.round(pit, 2);

		double vat = pit * Double.parseDouble(prop.getProperty("dynamicVATpct2"));
		double localVATsum = Precision.round(vat, 2);

		double pwv = localPrice - localVATsum;
		double localNetPrice = Precision.round(pwv, 2);

		// compare prices from the site vs prices calculated
		if (vatsumfromsite == localVATsum) {
			System.out.println("The Value-Added Tax from the site " + vatsumfromsite + " is equal to the calculated "
					+ localVATsum);
		} else {
			System.out.println("The Value-Added Tax from the site " + vatsumfromsite
					+ " is NOT equal to the calculated " + localVATsum);
			org.testng.Assert.fail();
		}
		;

		// compare prices from the site vs prices calculated
		if (netpricefromsite == localNetPrice) {
			System.out.println("Price without VAT from the site " + netpricefromsite + " is equal to the calculated "
					+ localNetPrice);
		} else {
			System.out.println("Price without VAT from the site " + netpricefromsite
					+ "  is NOT equal to the calculated " + localNetPrice);
			org.testng.Assert.fail();
		}
		;

		// get the pie chart elements of the higher percentage

		WebElement HigherPieChart = driver.findElement(By.xpath(loc.getProperty("higherpiechartdata")));
		String higherpiechartdata = HigherPieChart.getText();
		higherpiechartdata = higherpiechartdata.replaceAll("%", "");
		double higherpiechartfromsite = Double.parseDouble(higherpiechartdata);
		// System.out.println("The higher value of the pie chart: " +
		// higherpiechartfromsite);

		// get the pie chart elements of the lower percentage
		/*
		 * WebElement LowerPieChart =
		 * driver.findElement(By.xpath(loc.getProperty("lowerpiechartdata"))); String
		 * lowerpiechartdata = LowerPieChart.getText(); lowerpiechartdata =
		 * lowerpiechartdata.replaceAll("%", ""); double lowerpiechartfromsite =
		 * Double.parseDouble(lowerpiechartdata);
		 * System.out.println("The lower value of the pie chart: " +
		 * lowerpiechartfromsite);
		 */

		double lpcfs = 100 - higherpiechartfromsite;
		double lowerpiechartfromsite = Precision.round(lpcfs, 1);
		// System.out.println("The lower value of the pie chart: " +
		// lowerpiechartfromsite);

		// local pie chart higher value
		double hpcfl = ((pwv / pit) * 100);
		double higherpiechartfromlocal = Precision.round(hpcfl, 1);

		// compare the local vs. from site higher pie chart value
		if (higherpiechartfromlocal == higherpiechartfromsite) {
			System.out.println("The higher local " + higherpiechartfromlocal
					+ " pie chart % is equal to the higher pie chart % from the site " + higherpiechartfromsite);
		} else {
			System.out.println("The higher local " + higherpiechartfromlocal
					+ " pie chart % is NOT equal to the higher pie chart % from the site " + higherpiechartfromsite);
			org.testng.Assert.fail();
		}

		// local pie chart lower value
		double lpcfl = ((vat / pit) * 100);
		double lowerpiechartfromlocal = Precision.round(lpcfl, 1);

		// compare the local vs. from site lower pie chart value
		if (lowerpiechartfromlocal == lowerpiechartfromsite) {
			System.out.println("The lower local " + lowerpiechartfromlocal
					+ " pie chart % is equal to the higher pie chart % from the site " + lowerpiechartfromsite);
		} else {
			System.out.println("The lower local " + lowerpiechartfromlocal
					+ " pie chart % is NOT equal to the higher pie chart % from the site " + lowerpiechartfromsite);
			org.testng.Assert.fail();
		}

		// delete NetPrice sendkeys
		Tools.clearWebField(Price);
		System.out.println("\n");
	}

}
