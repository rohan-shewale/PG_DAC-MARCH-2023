package Star;

public class Star14 {
	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i;k++)	
			{
				System.out.print("*");
			}
			
			for(int l=2; l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		int i,j,k,l;
		for( i=2; i<=5; i++)
		{
			for( j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for( k=1; k<=i;k++)	
			{
				System.out.print("*");
			}
			
			for( l=2; l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
