package SimpleProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SM Computer\\Desktop\\Eclipse\\JavaSamples\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		WebElement srchbx = driver.findElement(By.id("twotabsearchtextbox"));
		srchbx.sendKeys("kurti");
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		
		WebElement kurti = driver.findElement(By.className("s-image"));
		kurti.click();
		
		WebElement select = driver.findElement(By.xpath("(//span[@data-csa-c-content-id='dropdown_selected_size_name'])[1]"));
		select.click();
		
		WebElement size = driver.findElement(By.xpath("//a[@id='native_dropdown_selected_size_name_1']"));
		size.click();
		
	}
}
