package StepDefinationLayer;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass {

}
//	public static String empID;
//
//	@Given("user is on LoginPage")
//	public void user_is_on_login_page() throws InterruptedException {
//
//		BaseClass.initialization();
//	}
//
//	@When("user enter a valid UserName and PassWord and click the Login button")
//	public void user_enter_a_valid_user_name_and_pass_word_and_click_the_login_button() throws InterruptedException {
//
//		LoginPage loginPage=new LoginPage();
//		loginPage.loginPageFunctionality("Admin", "admin123");
//	}
//
//	@Then("user is on  HomePage and validate the HomePageTitle")
//	public void user_is_on_home_page_and_validate_the_home_page_title() {
//
//		// validate the HomePage Title by using getTitle() method
//
//		String actualTitle = driver.getTitle();
//		Assert.assertEquals(actualTitle, "OrangeHRM");
//	}
//
//	@Then("validate HomePage URL")
//	public void validate_home_page_url() {
//
//		// validate HomePage URL by using getCurrentUrl() method
//		String actualURL = driver.getCurrentUrl();
//		boolean a = actualURL.contains("orangehrmlive");
//		Assert.assertEquals(a, true);
//
//	}
//
//	@When("user is on PIM Page")
//	public void user_is_on_pim_page() throws InterruptedException {
//
//		// find the Element or Object of PIM page link and click on it
//		driver.findElement(By.xpath("//span[text()='PIM']")).click();
//		Thread.sleep(2000);
//	}
//
//	@Then("validate PIM Page URL")
//	public void validate_pim_page_url() {
//
//		// validate the PIM Page URL by using getCurrentUrl() method
//
//		String currentUrl = driver.getCurrentUrl();
//		boolean b = currentUrl.contains("pim");
//		Assert.assertEquals(b, true);
//	}
//
//	@When("user click on Add Employee")
//	public void user_click_on_add_employee() throws InterruptedException {
//
//		// find the Element or Object of Add Employee button and click on it
//		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
//		Thread.sleep(3000);
//	}
//
//	@When("user enter valid {string}, {string} , {string} and click on Save button")
//	public void user_enter_valid_and_click_on_save_button(String FirstName, String MiddleName, String LastName)
//			throws InterruptedException {
//
//		// find the element or object of firstname,middlename and lastname
//		driver.findElement(By.name("firstName")).sendKeys(FirstName);
//		driver.findElement(By.name("middleName")).sendKeys(MiddleName);
//		driver.findElement(By.name("lastName")).sendKeys(LastName);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
//	}
//
//	@When("user capture the EmployeeId")
//	public void user_capture_the_employee_id() {
//
//		// find the element of employeeId and capture it by using getAttribute() method
//		WebElement id = driver.findElement(By.xpath("(//label[text()='Employee Id']/following::input[1])"));
//		empID = id.getAttribute("value");
//
//	}
//
//	@When("user click on Add EmployeeList")
//	public void user_click_on_add_employee_list() throws InterruptedException {
//
//		// find the element of EmployeeList and click on it
//		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
//		Thread.sleep(3000);
//
//	}
//
//	@When("user enter the EmployeeId and click on Search Button")
//	public void user_enter_the_employee_id_and_click_on_search_button() throws InterruptedException {
//
//		// find the element of EmployeeId and enter the EmployeeId in it
//		driver.findElement(By.xpath("//label[text()='Employee Id']/following::input[1]")).sendKeys(empID);
//		Thread.sleep(3000);
//		// find element of search button
//		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
//	}
//
//	@When("user select searched EmployeeId and click on delete")
//	public void user_select_searched_employee_id_and_click_on_delete() throws InterruptedException {
//
//		// find the element of searched employeeId
//		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]")).click();
//		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-trash'])[1]")).click();
//		Thread.sleep(3000);
//		
//	}
//
//	@Then("validate confirm delete window and click on yes deleted")
//	public void validate_confirm_delete_window_and_click_on_yes_deleted() throws InterruptedException {
//
//		// find the physical text and capture it
//
//		String actualText = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--card-body']"))
//				.getText();
//		boolean d = actualText.contains("delete");
//		Assert.assertEquals(d, true);
//		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
//		Thread.sleep(3000);
//	}
//
//	@When("user click on Profile image")
//	public void user_click_on_profile_image() throws InterruptedException {
//
//		// find the element or object of profile dropdown
//		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
//		Thread.sleep(3000);
//	}
//
//	@When("user click on Logout button")
//	public void user_click_on_logout_button() throws InterruptedException {
//
//		// find the element or object of logout button and click on it
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
//		Thread.sleep(3000);
//	}
//
//}
