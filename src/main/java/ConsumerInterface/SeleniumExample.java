package ConsumerInterface;

import java.util.List;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumExample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement>  elements=  driver.findElements(By.xpath("//a"));
		
		/*Traditional Way
		for(int i=0;i<elements.size();i++) {
			System.out.println(elements.get(i).getText());
		}*/
		
		//Java 8
		// Here Consumer<WebElement> --> Here WebElement is a parameter to consumer and returns nothing
		elements.forEach(e -> System.out.println(e.getText()));
		Consumer<WebElement> consumer = (e)->{
			if(!(e.getText().isEmpty())) {
				System.out.println(e.getText());
			}
		};
		
		driver.quit();
	}

}
