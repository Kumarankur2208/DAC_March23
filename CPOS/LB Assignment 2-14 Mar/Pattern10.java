import java.util.Scanner;

class Pattern10{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();

		
		
		for(int i=n;i>=1;i--)
		{
			int ch=64;
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
				
			for (int k=i;k<=n;k++)
			{
				System.out.print((char)(ch+k)+" ");	
				
			}
			
			System.out.println();
		}
	
	}
	
}