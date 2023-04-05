import java.util.Scanner;

class HIHalfPyramid{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();

		
		
		for(int i=1;i<=n;i++)
		{
			
			for (int j=n;j>=1;j--)
			{
				if(i!=1)
				{
					
					if(j==n || j==i)
					{
					System.out.print("*");	
					}
					else
					{
					System.out.print(" ");
					}
				}
				else
				{
				
					System.out.print("*");
				}
			}
			
			System.out.println();
						
		}
		
	}
	
}