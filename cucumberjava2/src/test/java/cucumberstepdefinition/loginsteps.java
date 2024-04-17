package cucumberstepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {

	WebDriver driver;

	
@Given("user is on login page")
public void user_is_on_login_page() {
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
  System.out.println("login page");
  
}

@When("user enters username and password")
public void user_enters_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
  driver.findElement(By.name("username")).sendKeys("Admin");
  driver.findElement(By.name("password")).sendKeys("admin123");
 
}

@And("clicks the login button")
public void clicks_the_login_button() {
	System.out.println("User Clicked the Login Button");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String title = driver.getTitle();
	System.out.println("Home Page Title is" + title);
	System.out.println("User lands on Home Page");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[4]/button")).click();
	
	
	
}


@Then("user is navigated to home page")
public void user_is_navigated_to_home_page() {
 
  driver.close();
  //driver.quit();
  
}


	
	
}
