package pages;

import static utils.BrowserUtils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.annotations.Test;

import applicationCommonMethods.Logout;
import utils.DataProviderUtils;
import utils.ElementUtils;
import utils.ExcelUtils;
import utils.PropertiesUtils;

public class LoginPage {

	By username_TextField = By.name("username");
	By password_TextField = By.name("password");
	By login_btn = By.xpath("//button[@type='submit']");
	By heading = By.xpath("//h5[text()='Login']");
	By invalid = By.xpath("//*[text()='Invalid credentials']");

	public void setUsername_TextField() throws Exception {
		ElementUtils.textField(username_TextField, PropertiesUtils.getPropertyValue().getProperty("username"));
	}

	public void setPassword_TextField() throws Exception {
		ElementUtils.textField(password_TextField, PropertiesUtils.getPropertyValue().getProperty("password"));
	}

	public void setLogin_btn() throws Exception {
		ElementUtils.performClick(login_btn);
	}

	public void verifyLoginPage() {
		if (ElementUtils.elementVisibility(heading)) {
			System.out.println("Pass:User in login page!...");
		} else {
			System.out.println("Fail:User not in login page!...");
		}
	}
	@Test(dataProvider = "excelData",dataProviderClass = DataProviderUtils.class)
	public void performLogin() throws Exception {
		Object[][] data=new DataProviderUtils().excelDataProvider();
		for(int i=0;i<data.length;i++)
		{
			String username=data[i][0].toString();
			String password=data[i][1].toString();
			ElementUtils.textField(username_TextField, username);
			ElementUtils.textField(password_TextField, password);
			setLogin_btn();
			Thread.sleep(2000);
			if (driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed()) {
				Logout.logout();
				Assert.assertTrue(true);
			} else {
				Assert.fail();
			}
		}
	}

}
