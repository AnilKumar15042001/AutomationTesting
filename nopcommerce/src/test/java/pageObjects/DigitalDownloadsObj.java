package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadsObj {

	public WebDriver driver;
	public DigitalDownloadsObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	//div[@class='center-2']/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div/div[3]/div[1]--price
	@FindBy(linkText="Digital downloads")
	public WebElement didgitalDownload;
	
	@FindBy(tagName="h1")
	 WebElement productHeading;
	
	@FindBy(xpath="//input[contains(@id,'CustomerEnteredPrice')]")
	 WebElement txtPrice;
	
	@FindBy(xpath="//input[contains(@id,'product_enteredQuantity')]")
	 WebElement txtQuantity;
	
	@FindBy(xpath="//button[contains(@id,'add-to-cart-button')]")
	 WebElement addtocartBtn;
	
	@FindBy(linkText="Download sample")
	 WebElement downloadSampleBtn;
	
	@FindBy(xpath="//p[@class='content']")
	 WebElement successMsg;
	
	@FindBy(xpath="//span[@title='Close']")
	 WebElement closeMsgNavBar;
	
	@FindBy(xpath="//span[@id='price-value-34']")
	WebElement priceReadOnlyText;
	
	public void setCloseMsgNavBar() {
		
		closeMsgNavBar.click();
	}

	public String getSuccessMsg() {
		return successMsg.getText();
	}

	public String getProductHeading() {
		return productHeading.getText();
	}

	public void setDidgitalDownload() {
		didgitalDownload.click();
	}

	public void setTxtPrice(String price) {
		
		    txtPrice.clear();
		    txtPrice.sendKeys(price);
	}

	public void setTxtQuantity(String quantity) {
		txtQuantity.clear();
		txtQuantity.sendKeys(quantity);
	}

	public void setAddtocartBtn() {
		addtocartBtn.click();
	}

	public void setDownloadSampleBtn() {
		downloadSampleBtn.click();
	}
	
//	@FindBy(xpath="")
//	 WebElement ;
	
}
