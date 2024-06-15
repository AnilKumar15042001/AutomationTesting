package string;

public class CharAt {

	public void charAtMethod(String str)
	{
		int length=str.length();
//		Accessing First and Last Character by Using the charAt() Method
		
		System.out.print(str.charAt(0)+"\t");
		System.out.println(str.charAt(length-1));
//		Print Characters Presented at Odd Positions by Using the charAt() Method
		
		for(int i=0;i<length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" place:"+str.charAt(i));
			}
		}
		
//		Counting Frequency of a character in a String by Using the charAt() Method
		
		int count=0;
		for(int i=0;i<length;i++)
		{
			
			if(str.charAt(i)=='n')
			{
				count++;
			}
		}
		System.out.println(count);
		
//		Counting the Number of Vowels in a String by Using the chatAt() Method
		
	}
	
	public static void main(String[] args) {
		
		CharAt obj=new CharAt();
		obj.charAtMethod("Anil");
	}
}
