package actions_Robot.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;


public class Actions_Robot {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement closebutton = driver.findElement(By.xpath("//span[@role='button']"));
		closebutton.click();
		
		Actions act = new Actions(driver);
		act.click();
		
		WebElement clickwebelement = driver.findElement(By.xpath("//a[.='Become a Seller']"));
		act.click(clickwebelement).build().perform();
		WebElement movetoelement = driver.findElement(By.xpath("(//a[.='Shopsy'])[2]"));
		act.moveToElement(movetoelement).build().perform();
		act.contextClick().build().perform();
		
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
