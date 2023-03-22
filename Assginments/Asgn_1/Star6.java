package Star;

public class Star6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,l;
		for( i=5; i>=1; i--)
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
