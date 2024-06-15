package Java_Automation;

import java.util.Scanner;

public class Bike {

	public String model;
	public String color;
	public int speed;
	public int initialSpeed;
	public int n; 
	Bike(int initialSpeed)
	{
		this.initialSpeed=initialSpeed;
		System.out.println("Initial Speed="+initialSpeed+" km/h");
	}
	public void bikeInfo(String model,String color)
	{
		this.model=model;
		this.color=color;
		System.out.println("Bike Model Is:"+model);
		System.out.println("Bike Color Is:"+color);
	}
	public void increaseSpeed(int speed)
	{
		n=speed;
		if(initialSpeed>=0 && speed>0)
		{
			for(int i=5;i<=speed;i+=5)
			{
			System.out.println("Speed="+initialSpeed+"(km/h)"+" + "+i+"(km/h)"+" = "+(i+initialSpeed)+"(km/h)");
			}
	    }
		else
		{
			System.out.println("Bike Is Not Moving");
		}
	  
		this.speed=speed;
	}
	public void decreaseSpeed(int dSpeed) 
	{
		System.out.println("Bike Current Speed="+speed+"(km/h)");
		if(dSpeed>0 && speed-dSpeed>=0)
		{
			for(int i=5;i<=dSpeed;i+=5)
			{
				System.out.println(speed+"(km/h)"+" - "+i+"(km/h)"+" = "+(speed-i)+"(km/h)");
			}
			System.out.println("After Braking The Bike Speed Is="+(speed-dSpeed)+"(km/h)");
			
		}
		else
		{
			System.out.println("Brake Value Is="+dSpeed+"(km/h)");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Bike Key:");
		int key;
		Scanner s=new Scanner(System.in);
		key=s.nextInt();
		if(key==1234)
		{
			System.out.println("Bike Is Start");
			Bike obj=new Bike(0);
			obj.increaseSpeed(50);
			obj.decreaseSpeed(10);
			obj.bikeInfo("Hero", "Red");
			
		}
		else
		{
			System.out.println("You Are Thief");
		}
		
	}

}
