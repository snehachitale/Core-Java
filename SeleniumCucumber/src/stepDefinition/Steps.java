package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	
	@Given("^Open the chrome and start application$")
	public void open_the_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://twitter.com/login");
	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/label[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("snehachitale26");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/label[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Sneha@26");
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]")).click();
	}
}
