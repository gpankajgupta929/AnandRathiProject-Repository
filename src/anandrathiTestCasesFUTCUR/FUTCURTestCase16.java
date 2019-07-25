package anandrathiTestCasesFUTCUR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import anandrathiFUTCUR.FUTCURMethodTC1;
import anandrathiFUTCUR.FUTCURMethodTC16;

import org.testng.annotations.*;

public class FUTCURTestCase16 
{
     @Test (description = "Place Order Entry > MIS PRODUCT > MKT Order Type > Validity IOC.")
    public void BuyOrder() throws Exception 
 
	{
		 ChromeOptions notify = new ChromeOptions();
		 notify.addArguments("--disable-notifications");
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 WebDriver rupee = new ChromeDriver(notify);
		 
		 rupee.manage().window().maximize();
		   
		   rupee.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		   
		   rupee.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		   
		   rupee.get((new FUTCURMethodTC1()).getData()); //Invoking URL on Browser
		   
		   rupee.findElement(By.xpath("//*[@id=\"id\"]")).sendKeys(new FUTCURMethodTC1().getData1()); //Inputting User ID
		   
		 Thread.sleep(2000);
	   
	   rupee.findElement(By.id("loginb1")).click(); //Clicking on Validate Button
	   
	   rupee.findElement(By.id("newpassword")).sendKeys(new FUTCURMethodTC1().getData2()); //Inputting Password
	   
	   rupee.findElement(By.xpath("//*[@id=\"2ndpage\"]/div[2]/div/label")).click(); //Checking Images's checkbox
	   
       rupee.findElement(By.xpath("//*[@id=\"2ndpage\"]/div[3]")).click(); //Clicking on Submit Button
		   
       rupee.findElement(By.xpath("//*[@id=\"ans_1\"]")).sendKeys(new FUTCURMethodTC1().getData3(false)); //Inputting Security answer No.1
	   
	   rupee.findElement(By.xpath("//*[@id=\"ans_2\"]")).sendKeys(new FUTCURMethodTC1().getData3(true)); //Inputting Security answer No.2
	   
	   rupee.findElement(By.xpath("//*[@id=\"securityquesbtn\"]")).click(); //Clicking on Security Q&A Submit Button
	   
	   rupee.findElement(By.xpath("//*[@id=\"mainmenu\"]/ul/li[8]")).click(); //Clicking on Homepage's Search Button
	   
	   	Select drpInstrument = new Select(rupee.findElement(By.id("addSymbolInst")));
	   drpInstrument.selectByVisibleText("FUTCUR");	   
	   
	   rupee.findElement(By.xpath("//*[@id=\"symbollookup\"]")).sendKeys(new FUTCURMethodTC16().getData0()); //Inputting searching value in Search Pop-Up Screen
	   
	   rupee.findElement(By.xpath("/html/body/div[8]/ul/li[1]/div")).click(); //Capturing value from AutoSuggested List
	   
	   //-->/html/body/div[8]/ul/li[1] For capturing 1st Value
	   //->/html/body/div[10]/ul/li[2]  For capturing 2nd value  
	   
	   WebElement element = rupee.findElement (By.id("TradeSymbol"));
	   JavascriptExecutor js = (JavascriptExecutor) rupee;
	   
	   js.executeScript ("arguments[0].click();" , element);
	   
	   Thread.sleep(2000);
	   
	   rupee.findElement(By.id("buy_active")).click(); //Clicking on Buy Action on Placing Order Screen
	   
	   rupee.findElement(By.xpath("//*[@id=\"orderLot\"]")).clear(); //Clearing By-Default value from Quantity field
	   
	   rupee.findElement(By.xpath("//*[@id=\"orderLot\"]")).sendKeys(new FUTCURMethodTC16().getData1()); //Setting Order Quantity value
	   //sendKeys only accept CharSequences
	   
	   Select drpOrder = new Select(rupee.findElement(By.id("orderType")));
	   drpOrder.selectByVisibleText("MKT");
	   
	   Select drpProduct = new Select(rupee.findElement(By.id("orderProduct")));
	   drpProduct.selectByVisibleText("MIS");
	   
	   rupee.findElement(By.xpath("//input[@id=\"orderMktprotection\" and @name=\"mktprotection\"]")).clear();
	   
	   rupee.findElement(By.xpath("//input[@id=\"orderMktprotection\" and @name=\"mktprotection\"]")).sendKeys(new FUTCURMethodTC16().getData2()); //Setting Market Protection value
	   
	   rupee.findElement(By.xpath("//*[@id=\"more_less_fields\"]/h6/a")).click(); //Clicking on More Field
	   
	   Select drpOrderValidity = new Select(rupee.findElement(By.id("orderValidity")));
	   drpOrderValidity.selectByVisibleText("IOC");
	   
	  rupee.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div[1]/div/div[1]/div[14]/div/div/div[5]/button")).click(); //Clicking Submit Order button
	   
	   rupee.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button[2]")).click(); //Clicking on Order Confirmation button
	   
	   Thread.sleep(2000);
	   
	   rupee.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button[1]")).click(); //Clicking Ok button of Confirm Message screen
	   
	   Thread.sleep(2000);
	   
	   String statuString1 = rupee.findElement(By.xpath("//div[@id=\"orderBookGrid\"]/div[5]/div/div[1]/div[4]")).getText(); //Path for Status Grid Text
	   
		 if(statuString1.equalsIgnoreCase("completed"))
		   {
			   System.out.println("IOC Order got Completed.");
			   
			   rupee.findElement(By.xpath("/html/body/section[1]/nav/div/div[3]/ul/li[10]/a/span")).click(); //Clicking on Power Button to Signout
			   Thread.sleep(2000);
			   rupee.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button[2]")).click(); //Clicking Ok button of Confirm Message screen
			   
			   //-->/html/body/section[5]/div/div/div/div/div/div[3]/button[2]
			 //button[@id="action_model1" or type='button'] 
			   
			   rupee.close();
			   
			   }
		   else
		   {
			   System.out.println("IOC Order got Cancelled.");
			   
			   rupee.findElement(By.xpath("//*[@id=\"mainmenu\"]/ul/li[10]")).click(); //Clicking on Power Button to Signout
			   
			   rupee.findElement(By.xpath("/html/body/section[5]/div/div/div/div/div/div[3]/button")).click(); //Clicking Ok button of Confirm Message screen 
				  
			  rupee.close();
		   }
	}
}