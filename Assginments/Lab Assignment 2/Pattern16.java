package Pattern;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5;i>=1;i--)
		{
			int k = 5;
			for(int j=5;j>=1;j--)
			{
				if(j>=i)
					System.out.print(k-- + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
