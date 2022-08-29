import java.util.*;
class W2Q4
{
	public statioc void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows of matrix A : ")
		int ma = in.nextInt();

		System.out.println("Enter the number of columns of matrix A : ")
		int na = in.nextInt();

		System.out.println("Enter the number of rows of matrix B : ")
		int mb = in.nextInt();

		System.out.println("Enter the number of columns of matrix B : ")
		int nb = in.nextInt();

		

		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
			{    
				c[i][j]=a[i][j]+b[i][j];     
				System.out.print(c[i][j]+" ");    
			}
		System.out.println();    
		}    
	}
}