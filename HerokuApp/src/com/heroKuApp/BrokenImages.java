package com.heroKuApp;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenImages extends WholeApp{
	
	public static void main(String[] args) {
		
		WholeApp.openApplication("");
		
		WholeApp.clickOnLink(4);
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		
		for(WebElement image:images)
		{
			String imageUrl=image.getAttribute("src");
			
			if(imageUrl !=null && !imageUrl.isEmpty())
			{
				if(imageUrl.startsWith("http"))
				{
					int statusCode=getResponseCode(imageUrl);
					if(statusCode !=200)
					{
						System.out.println("Broken images are:"+imageUrl);
						System.out.println(statusCode);
					}
				}
				else
				{
					System.out.println("invalid image url:"+imageUrl);
				}
			}
			else
			{
				System.out.println("empty image src");
			}
		}
		
		driver.close();
	}
	
	public static int getResponseCode(String urlString)
	{
		try {
			
			URL url=new URL(urlString);
			HttpURLConnection connection=(HttpURLConnection) url.openConnection();
			//connection.setRequestMethod("HEAD");
			return connection.getResponseCode();
		}
		catch(Exception e)
		{
			return 0;
		}
	}

}
