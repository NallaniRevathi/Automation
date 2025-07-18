package week4Assignments;
import java.time.Duration;
import java.util.ArrayList;
//import java.util.HashSet;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mynthra {

	

	
		public static void main(String[] args) throws InterruptedException {
			//initializing the ChromeDriver
			ChromeDriver driver = new ChromeDriver();
			//Loaded the URL
			driver.get("https://www.myntra.com/");
			//maximize and wait for the elements to fully load
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Enter bags in search box and click enter
			driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bags", Keys.ENTER); 
			Thread.sleep(1000);
			//click on the men option
			driver.findElement(By.xpath("(//label[@class='common-customRadio gender-label'])[1]")).click();
			Thread.sleep(1000);
			//Click on the laptop Bags option
			
			driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[1]")).click();
			Thread.sleep(1000);
			//List to save all the elements found with the given path
			List<WebElement> countOfItems = driver.findElements(By.xpath("//div[@class='product-price']"));
			Thread.sleep(1000);
			//To get the size of the List(countOfItems)
			int size = countOfItems.size();
			System.out.println(size);
			//List to save all the elements found with the given path
			
			List<WebElement> listofBrands = driver.findElements(By.xpath("//h3[@class='product-brand']"));
			Thread.sleep(1000);
			//Initializing string named listBrandnames to retrieve all the brand names into a list
			List<String> listBrandnames = new ArrayList<String>();
			//Set<String> s = new LinkedHashSet<String>(listBrandnames);
			//for loop to iterate through all the elements in listofBrands and save them as a String list in listBrandnames
			
			for (WebElement each : listofBrands) {
				
				String text =each.getText();
				//System.out.println(text);
				listBrandnames.add(text);
			}
			//List to save all the elements found with the given path
			List<WebElement> listofProducts = driver.findElements(By.xpath("//h4[@class='product-product']"));
			Thread.sleep(1000);
			//Initializing string named nameofProducts to retrieve all the product names into a list
			List<String> nameofProducts = new ArrayList<String>();
			//for loop to iterate through all the elements in listofProducts and save them as a String list in nameofProducts
			for (WebElement each2:listofProducts) {
				String text1 = each2.getText();
				//System.out.println(text1);
				nameofProducts.add(text1);
			}
			//To print all the names of brands and products as a list
			System.out.println("List of Brands"+listBrandnames);
			System.out.println("product names"+nameofProducts);
		}


		}