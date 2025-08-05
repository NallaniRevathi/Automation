package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		//select item
		driver.findElement(By.xpath("(//div[text()='bags for boys'])[1]")).click();
		String text=driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//span[text()='Safari']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//span[text()='American Tourister']/preceding-sibling::div")).click();
		//select new arrivals
		driver.findElement(By.xpath("//span[@data-action='a-dropdown-button']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String name=driver.findElement(By.xpath("(//div[@data-cy='title-recipe']//span)[1]")).getText();
		System.out.println("Bag name is:"+name);
		String name2=driver.findElement(By.xpath("(//span[text()='1,299'])[1]")).getText();
		System.out.println("The amount is:"+name2);
		System.out.println("The page tile is:"+driver.getTitle());
		
		
	}

}
