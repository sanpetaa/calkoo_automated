package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoThroughAllVATRates extends BaseTest {
	
	public static void VATrateslist() {

	// identify elements in menu with findElements
    List<WebElement> p = driver.findElements(By.xpath(loc.getProperty("forVAT")));
    {
    //iterate through list
    for( WebElement i: p)
       System.out.println(i.getText());}
    }
}

