package Pattern;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5; i>=1; i--)
		{
			for(int j=i-1; j>0; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=i; k<=5;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
