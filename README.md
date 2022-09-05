# Calkoo Test Automation Base

#### About 
The goal of this project is fulfill my homework I get from the Global Blue REX Team.
##### Task

* Please identify at least two test cases for automation:
* * explain why you would choose specifically those
* * automate them using Cypress, Robot or Selenium (if having experience)

#### Actual Testcases

##### testcase.CheckCalculations.java 

Cheking the whole calculation process and compare it to my local calculation, because this is the main function of the site.

 I selected the 3 most commonly used countries from global blue TOP destinations: https://www.globalblue.com/corporate/media/press/global-blue-research-confirms-the-chinese-are-still-the-most-valuable-globe-shoppers

Check on all available VAT rates
even If  I am filling the Netprice, VatSum or Price fields
And Cheking the pie chart if it correct or not. 

I used soft assertions.
In case of any failure and the application taking screenshots.

##### testcase.VatRateAvailable.java 
If any change on the webpage will happen
And if  multipliers will not be equivalent to the VAT rates
Then the calculation would be wrong. 
These informations are necessery for my first testcase.

# GLOBAL BLUE - HOMEWORK

Background info
Calkoo introduced a simple online VAT calculator for calculating tax on their website:

http://www.calkoo.com/?lang=3&page=8

##### User story
As a traveller, I want to calculate the various purchase/tax amounts to verify that my shop
receipt is correct, and the merchant correctly charged the VAT for my recently bought items.

##### ACCEPTANCE CRITERIA
* User must select a country which applies VAT scheme
* User must be able to choose a valid VAT rate for the selected country
* One of the following amounts are supported as an input:
* * Net
* * Gross
* * VAT
* Amounts can be entered with maximum 2 decimal digit precision
* Given all mandatory fields (country, vat rate, one of the amounts) are provided,
the website will calculate and show the other 2 amounts which were not
provided originally as an input value
* The API provides an error with meaningful error message, in case of:
* * negative input
* * amount >999.999.999

##### TECHNICAL REQUIREMENTS
* Please document test cases (manual) that come to your mind.
* In case you encounter bugs - which one and how would you report them (provide
example)
* In case there are open questions regarding requirements/acceptance criteria:
* * Document the questions you would like to ask/clarify with End
users/business/product owner based on the given information.

#### Technological prerequisites
 
* Installed Java JDK version 9+ 
* Make sure environment path to Java JDK is set as JAVA_HOME 
* Installed GIT available in command line 
* Installed newest version of Chrome/Firefox browser
* IDE of your choice for code development (Eclipse recommended and supported)
* Tools installed: TestNG, Maven



#### Download with use of GIT:
The remote repository is public and it can be found below. 
```
 git clone: https://github.com/sanpetaa/calkoo_automated.git
```