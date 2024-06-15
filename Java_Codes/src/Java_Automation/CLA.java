package Java_Automation;

class CommandLineArguments
 {
 	public static void main(String[] args) {
 		try{
 		for (int i=0;i<args.length;i++ ) {
 		System.out.println("CommandLineArguments is:"+args[i]);	
 		}
 		}
 		catch(Exception e)
 		{
 			System.out.println(e);
 		}
 	}
 }