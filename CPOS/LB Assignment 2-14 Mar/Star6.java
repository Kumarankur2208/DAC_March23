import java.util.Scanner;

class Star6{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			for(int k=0;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
						
			
			System.out.println();
		}			
	}
	
}