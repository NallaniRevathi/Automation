package week4Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlertInteraction {

	public static void main(String[] args) {
		//initializing the Chrome WebDriver
				ChromeDriver driver = new ChromeDriver();
				
				//Opening the URL
				driver.get("https://www.leafground.com/alert.xhtml");
				
				//Maximized the window and waited for 30 secs for the page to completely load
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//To click on the Show button under Alert (Prompt Dialog)
				driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();				
				//To switch to the alert
				Alert alert = driver.switchTo().alert();
				
				//Initialized a String variable to s to save the text to be entered in the alert
				String R = "Revathi";
				
				//The String 's' has been passed to the alert
				alert.sendKeys(R);
				
				//Alert will be accepted
				alert.accept();
				
				//To get the text displayed after accepting the alert
				String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
				
				//To verify the text displayed with the input String 's'
				if(text.contains(R)) {
					System.out.println("The input is verified");
				} else {
					System.out.println("The input is invalid");
				}
			}
}