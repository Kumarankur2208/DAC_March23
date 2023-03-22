import java.util.Scanner;

class Pyramid6{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();

		
		
		for(int i=1;i<=n;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=n-i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}
	
}