package Pyramid;

public class Pattern3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for( i=1; i<=6; i++)
		{
			for( j=6; j>i; j--)
			{
				System.out.print(" ");
			}
			
			for( k=1; k<=(2*i-1);k++)	
			{
				if((i==6 && k%2!=0) || k==1 || k==(2*i-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
