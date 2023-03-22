package Pyramid;

public class Pattern3_10 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				if(i==j || i==1 || i==5 || j==1 || j==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
