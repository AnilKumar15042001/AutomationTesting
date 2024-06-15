package array_ArrayList;

public class A {
		public static void main(String[] args) {

			int k=0;
			for (int i = 1; i <=5; i++) {
				int l= i <= 3 ? k++ : k--;
				for (int j = 1; j <=3 ; j++) {
					if (j >=4-k && j<=2+k) {
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
}
