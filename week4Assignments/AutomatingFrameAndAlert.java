package week4Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameAndAlert {

	public static void main(String[] args) {
		//initializing the Chrome WebDriver
				ChromeDriver driver = new ChromeDriver();
				
				//Opening the URL
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				
				//Maximized the window and waited for 30 secs for the page to completely load
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Switched-to iframe
				WebElement iframeEnter = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
				driver.switchTo().frame(iframeEnter);
				
				//To click on the try it button
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				
				//Switched to alert - To interact with the alert
				Alert alert = driver.switchTo().alert();
				
				//Initialized a String variable to s to save the text to be entered in the alert
				String H = "Harry Potter"; 
				
				//The String 's' has been passed to the alert
				alert.sendKeys(H);
				
				//Alert will be accepted
				alert.accept();
				
				//To get the text displayed after accepting the alert
				String textDisplayed = driver.findElement(By.id("demo")).getText();
				
				//This will print the text displayed after accepting the alert
				System.out.println(textDisplayed);
				
				//To verify the text displayed with the input String 's'
				if(textDisplayed.contains(H)) { 
					System.out.println("The action is Performed correctly");
				} else {
					System.out.println("The action is not Performed correctly");
				}
				
				//This will switch out of all the iframe 
				driver.switchTo().defaultContent();
				
				//To verify the driver is out of the iframe and print the Title of the Page
				System.out.println(driver.getTitle());
			}

}