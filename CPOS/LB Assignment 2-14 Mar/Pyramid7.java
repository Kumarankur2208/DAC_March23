import java.util.Scanner;

class Pyramid7{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();

		
		
		for(int i=n;i>=1;i--)
		{
			for(int k=0;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
		
		
	}
	
}