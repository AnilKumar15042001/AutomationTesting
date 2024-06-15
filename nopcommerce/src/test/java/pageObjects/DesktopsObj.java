package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import stepDefinition.Base;

public class DesktopsObj extends Base{

	public WebDriver driver;
	public DesktopsObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Computers")
	public WebElement computersModule;
	
	@FindBy(linkText="Desktops")
	WebElement DesktopsSubModule;
	
	@FindBy(xpath="//h1[normalize-space()='Desktops']")
	WebElement heading;
	
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement sortByDropdown;
	
	@FindBy(xpath="//select[@id='products-pagesize']")
	WebElement displayDropdown;
	
	@FindBy(xpath="//select[@id='product_attribute_1']")
	WebElement processorDropdown;
	
	@FindBy(xpath="//select[@id='product_attribute_2']")
	WebElement RAMDropdown;
	
	@FindBy(xpath="//input[@id='product_attribute_3_6']")
	WebElement HDDRadioBtn1;
	
	@FindBy(xpath="//input[@id='product_attribute_3_7']")
	WebElement HDDRadioBtn2;
	
	@FindBy(xpath="//input[@id='product_attribute_4_8']")
	WebElement OSRadioBtn1;
	
	@FindBy(xpath="//input[@id='product_attribute_4_9']")
	WebElement OSRadioBtn2;
	
	@FindBy(xpath="//input[@id='product_attribute_5_10']")
	WebElement softwareCheckbox1;
	
	@FindBy(xpath="//input[@id='product_attribute_5_11']")
	WebElement softwareCheckbox2;
	
	@FindBy(xpath="//input[@id='product_attribute_5_12']")
	WebElement softwareCheckbox3;
	
	@FindBy(xpath="//span[@id='price-value-1']")
	WebElement priceTag;
	
	@FindBy(xpath="//input[@id='product_enteredQuantity_1']")
	WebElement txtQuantity;
	
	@FindBy(xpath="//button[@id='add-to-cart-button-1']")
	WebElement AddToCartBtn;

	public void setProcessorDropdown(String string) {
		//processorDropdown.click();
		s=new Select(processorDropdown);
		s.selectByVisibleText(string);
	}

	public void setOSRadioBtn1() {
		OSRadioBtn1.click();
	}

	public String getHeading() {
		return heading.getText();
	}

	public String getPriceTag() {
		return priceTag.getText();
	}

	public void setComputersModule() {
		act=new Actions(driver);
		act.moveToElement(computersModule).build().perform();
	}

	public void setDesktopsSubModule() {
		DesktopsSubModule.click();
	}

	public void setDisplayDropdown(String string) {
		s=new Select(displayDropdown);
		s.selectByVisibleText(string);
	}

	public void setHDDRadioBtn(String string) {
		
			if(string.equalsIgnoreCase("320 GB"))
			{
				HDDRadioBtn1.click();
			}
			else if(string.equalsIgnoreCase("400 GB [+$100.00]"))
			{
				HDDRadioBtn2.click();
			}
	}

	public void setAddToCartBtn() {
		AddToCartBtn.click();
	}


	public void setSortByDropdown(String sortby) {
		s=new Select(sortByDropdown);
		s.selectByVisibleText(sortby);
	}

	public void setRAMDropdown(String string) {
		s=new Select(RAMDropdown);
		s.selectByVisibleText(string);
	}

	public void setOSRadioBtn(String string) {
		
	}

	public void setSoftwareCheckbox1() {
		if(softwareCheckbox1.isSelected()==false)
		{
			softwareCheckbox1.click();
		}
	}

	public void setTxtQuantity(String string) {
		txtQuantity.clear();
		txtQuantity.sendKeys(string);
	}
}
