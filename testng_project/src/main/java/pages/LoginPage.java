package pages;

import static components.AppCommon.driver;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import locators.LoginPageObj;
import utils.AssertUtils;
import utils.DataProviderUtils;
import utils.ElementUtils;
import utils.ExcelUtils;
import utils.PropertiesUtils;

public class LoginPage extends LoginPageObj{

	public void setUsername_TextField(String username) throws Exception {
		ElementUtils.textField(username_TextField, username);
	}

	public void setPassword_TextField(String password) throws Exception {
		ElementUtils.textField(password_TextField, password);
	}

	public void setLogin_btn() throws Exception {
		ElementUtils.performClick(login_btn);
	}

	public void verifyLoginPage() {
		Assert.assertTrue(ElementUtils.elementVisibility(heading), "Fail:User not in login page!...");
	}
	public void verifyErrorMessage() {
		Assert.assertTrue(ElementUtils.elementVisibility(txt_InvalidCredentials), "Fail:User not see an error message!...");
	}

	@Test(dataProvider = "excelData",dataProviderClass = DataProviderUtils.class)
	public void performLogin() throws Exception {
		SoftAssert softAssert;
		Object[][] data=DataProviderUtils.excelDataProvider();
		for(int i=0;i<data.length;i++)
		{
			String username=data[i][0].toString();
			String password=data[i][1].toString();
			setUsername_TextField(username);
			setPassword_TextField(password);
			setLogin_btn();
			try
			{
				if (ElementUtils.elementVisibility(By.xpath("//h6[text()='Dashboard']"))) {
					Logout.logout();
					Assert.assertTrue(true);
			     }
			}
			catch (Exception e) {
				softAssert=new SoftAssert();
				softAssert.fail();
			}

		}
	}
	
	public void login() throws Exception {
		String filePath=PropertiesUtils.getKeyValue("excelFilePath");
		String sheet=PropertiesUtils.getKeyValue("sheet");
		int rows=ExcelUtils.getRowCount(filePath, sheet);
		int cols=ExcelUtils.getRowCount(filePath, sheet);
		for(int i=1;i<=rows;i++)
		{
			setUsername_TextField(ExcelUtils.getCellData(filePath, sheet, i, 0));
			setPassword_TextField(ExcelUtils.getCellData(filePath, sheet, i, 1));
			String expected=ExcelUtils.getCellData(filePath, sheet, i, 2);
			String actual = "";
			setLogin_btn();
			try
			{
				actual=ElementUtils.elementText(txt_InvalidCredentials);
				if(expected.equals(actual))
				{
					AssertUtils.softAssertFail("Element is not visible!...");
				}
			}
			catch(Exception e)
			{
				AssertUtils.softAssertFail("Test is faild due to this");
				System.out.println("Element not displayed!...");
			}
			finally
			{
				if(!expected.equals(actual))
				{
					Logout.logout();
				}
			}
		}

	}

}
