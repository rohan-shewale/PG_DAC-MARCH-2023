package Pattern;

public class Pattern13 {
	public static void main(String[] args) {
		
		int i,j,k,l, ch =64;
		for( i=1; i<=5; i++)
		{
			for( j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for( k=1; k<=i;k++)	
			{
				System.out.print((char)(ch+i)+" ");
			}
			
			System.out.println();
		}
	}
}
