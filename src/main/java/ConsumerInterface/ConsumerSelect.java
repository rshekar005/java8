package ConsumerInterface;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConsumerSelect {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		/*
		selectFromDropdown(element,"Indigo", "text");
		selectFromDropdown(element,"4", "value");
		selectFromDropdown(element, "3", "index");
		//selectFromDropdown(element, "9", "inddex");*/
		selectFromDropDown(e -> e.selectByVisibleText("Indigo"), element);
		selectFromDropDown(e -> e.selectByIndex(3), element);
		selectFromDropDown(e -> e.selectByValue("6"), element);
		
		
		List<WebElement> options = new Select(driver.findElement(By.id("cars"))).getOptions();
		options.stream().skip(2).forEach(e ->e.click());
		
	}
	
	/*Traditional Way. Writing if conditions is familiar to us but they are prone to errors
	public static void selectFromDropdown(WebElement element, String testorvalueorindex, String strategy) {
		Select select = new Select(element);
		if(strategy.equalsIgnoreCase("text")) {
			select.selectByVisibleText(testorvalueorindex);
		}else if(strategy.equalsIgnoreCase("value")) {
			select.selectByValue(testorvalueorindex);
		}else if(strategy.equalsIgnoreCase("index")) {
			select.selectByIndex(Integer.parseInt(testorvalueorindex));
		}else {
			System.out.println("Please select correct strategy");
		}
		
	}*/
	
	//Java 8
	private static void selectFromDropDown(Consumer<Select> consumer, WebElement element) {
		consumer.accept(new Select(element));
	}

}
