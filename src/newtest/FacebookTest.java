package newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class FacebookTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 EdgeDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
	       
	     driver.navigate().to("https://www.facebook.com");
	     
	     //sign in to Facebook
	     WebElement username = driver.findElement(By.id("email"));
	     username.sendKeys("test@gmail.com");
	     WebElement password = driver.findElement(By.id("pass"));
	     password.sendKeys("password10");
	     WebElement loginButton = driver.findElement(By.cssSelector("button[name='login']"));
	     loginButton.click();
	     
	     //Update status here
	     WebElement newStatus = driver.findElement(By.xpath("//div[@class='x1i10hfl x6umtig x1b1mbwd xaqea5y xav7gou x9f619 x1ypdohk xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8 x1hl2dhg xggy1nq x87ps6o x1lku1pv x1a2a7pz x6s0dn4 xmjcpbm x107yiy2 xv8uw2v x1tfwpuw x2g32xy x78zum5 x1q0g3np x1iyjqo2 x1nhvcw1 x1n2onr6 xt7dq6l x1ba4aug x1y1aw1k xn6708d xwib8y2 x1ye3gou']"));
	     newStatus.click();
	     
	     Thread.sleep(2000);
	     newStatus.sendKeys("\nMicheal Adeniyi");
	     //wait
	     Thread.sleep(2000);
	     
	     WebElement postBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div[2]/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div"));
	     postBtn.click();
	     
	}
}


