package Pyramid;

public class Pattern3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for( i=1; i<=6; i++)
		{
			for( j=6; j>i; j--)
			{
				System.out.print(" ");
			}
			
			for( k=1; k<=i;k++)	
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
