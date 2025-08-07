package baseclass;
import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static EdgeDriver driver;
	@BeforeMethod
	public void preCondn() {
		 driver=new EdgeDriver();
		 System.out.println(driver);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@AfterMethod
	public void postCondn() {
		driver.close();
		
	}

}
