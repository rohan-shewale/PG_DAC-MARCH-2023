package Pattern;

public class Pattern18 {
	public static void main(String[] args) {
		int ch = 64;
		for(int i=0;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print((char)(ch+j	)+ " ");
			}
			System.out.println();
		}
	}
}
