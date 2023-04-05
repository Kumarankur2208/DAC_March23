import java.util.Scanner;

class Star4{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
						
			
			System.out.println();
		}			
	}
	
}