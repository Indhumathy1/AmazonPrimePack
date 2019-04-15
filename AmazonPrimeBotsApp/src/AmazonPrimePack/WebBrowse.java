package AmazonPrimePack;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.log4j.lf5.util.*;


	



public class WebBrowse {

	
	
	static org.apache.log4j.Logger logger =  LogFile.getLogFile();

		public static void getNutritionFacts(WebDriver driver ) {
			
			driver.findElement(By.linkText("Whole Foods")).click();
			driver.findElement(By.xpath("//img[starts-with(@alt, 'Prime Pantry')]")).click();
	      
			

			//Gourmet Foods
			//driver.findElement(By.xpath("//*[@id=\"leftNav\"]/ul[1]/div/li[1]/span/a/h4")).click();
			driver.findElement(By.linkText("Grocery & Gourmet Food")).click();
			driver.findElement(By.linkText("Breads & Bakery")).click();
			driver.findElement(By.linkText("Free of Trans Fat (0g)")).click();
			driver.findElement(By.xpath("//img[starts-with(@alt, '365 Everyday Value, Gluten Free Mint Chocolate Chip')]")).click();
			String Prod = driver.findElement(By.id("productTitle")).getText();
			String Price = driver.findElement(By.id("priceblock_ourprice")).getText();
			System.out.println(Prod);
			logger.info("Product:  "+ Prod);
			logger.info("Price:  " + Price);
			//Logger.getLogger(name, resourceBundleName)(Price);
			//Logger log = Logger.getLogger("Price");
			
			
		}
}

