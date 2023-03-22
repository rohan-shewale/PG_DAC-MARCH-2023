package Pattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i='A' ; i<='E'; i++)
		{
			for(char j='A'; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = s.nextInt();
		int ch = 64;
		
		for(int i=1; i<=n; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print((char)(ch+i)+" ");
			}
			System.out.println();
		}*/
	}

}
