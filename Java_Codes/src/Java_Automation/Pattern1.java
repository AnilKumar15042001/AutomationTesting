package Java_Automation;

public class Pattern1 {

	public static void main(String[] args) {
		                                                        
		for(int i=1;i<=5;i++)                                    
		                                                         
		{                                                         
			for(int j=1;j<=5;j++)                                 
			{                                                   
				if(j<=i)                                           
				{                                                
				  //System.out.print(i);
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}

}
/*
print j value
1
12    
1 2 3                  
1 2 3 4  
1 2 3 4 5 
*/                                        
/*
print i value
1
2 2
3 3 3
4 4 4 4 
5 5 5 5 5
*/