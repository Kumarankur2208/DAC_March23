import java.util.Scanner;

class Pyramid5{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();

		
		
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<=n-i;k++)
			{
				System.out.print("  ");
			}
			for (int j=n-i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			for (int h=n-1;h>=n-i;h--)
			{
				System.out.print(h+" ");
			}
			System.out.println();
		}
		
		
	}
	
}