package com.heroKuApp;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChallengingDOM extends WholeApp{

	public static void main(String[] args) throws Exception {
		
		WholeApp.openApplication("firefox");
		
		WholeApp.clickOnLink(5);
		
		int rows=driver.findElements(By.xpath("//div[@class='large-10 columns']//table/tbody/tr")).size();
		int cols=driver.findElements(By.xpath("//div[@class='large-10 columns']//table/tbody/tr[1]/td")).size();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				String data=driver.findElement(By.xpath("//div[@class='large-10 columns']//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=rows;i++)
		{
			if(cols==7)
			{
				List<WebElement> links=driver.findElements(By.xpath("//div[@class='large-10 columns']//table/tbody/tr["+i+"]/td[7]/a"));
				
				for(WebElement link:links)
				{
					String linkUrl=link.getAttribute("href");
					if(linkUrl !=null && !linkUrl.isEmpty())
					{
						if(linkUrl.startsWith("http"))
						{
							URL url=new URL(linkUrl);
							HttpURLConnection connection=(HttpURLConnection) url.openConnection();
							int statusCode=connection.getResponseCode();
							if(statusCode !=200)
							{
								System.out.println(statusCode);
								System.out.println("Broken links are:"+linkUrl);
							}
							else
							{
								System.out.println("Valid links are:"+linkUrl+" :-"+statusCode);
							}
						}
						else
						{
							System.out.println("invalid url"+linkUrl);
						}
					}
					else
					{
						System.out.println("Links are empty:"+linkUrl);
					}
				
				}
			}
		}
		WholeApp.closeApplication();
	}
}
