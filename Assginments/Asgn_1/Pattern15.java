package Pattern;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=1+i;j--)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
