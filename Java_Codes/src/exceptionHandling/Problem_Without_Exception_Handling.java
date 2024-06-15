package exceptionHandling;

public class Problem_Without_Exception_Handling {

	public static void main(String[] args) {
		
		int number=50;
		int arr[]= {1,3,5,7};
		
		//solution is try-catch block
		
//		try {
//			number=50/0;//may throw exception
//			// if exception occurs, the remaining statement will not exceute
//			System.out.println(number);
//		}
//		// try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(Exception e)// handling the exception by using Exception class(parent class)
//		{
//			System.out.println("can't devided by zero");
//			number=50/5; //resolve the exception in a catch block.
//			System.out.println(number);
//			// generating the exception in catch block 
//			number=100/0; //may throw exception 
//		}
		
		//to handle another unchecked exception
		 try  
	        {    
	        System.out.println(arr[10]); //may throw exception   
	        }  
	            // handling the array exception  
	        catch(ArrayIndexOutOfBoundsException e)  
	        {  
	            System.out.println(e);  
	        }  
		 System.out.println(arr[2]);
	}
}
