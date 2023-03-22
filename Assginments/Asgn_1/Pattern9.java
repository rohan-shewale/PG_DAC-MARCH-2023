package Pattern;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch = 64;
		for(int i=1; i<=5; i++)
		{
			for(int j=5-i; j>=1; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i;k++)
			{
				System.out.print((char)(ch+k)+" ");
			}
			System.out.println();
		}
	}

}
