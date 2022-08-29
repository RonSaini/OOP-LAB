import java.util.*;
class W2Q4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows of matrix A and B : ");
		int m = in.nextInt();

		System.out.println("Enter the number of columns of matrix A and B : ");
		int n = in.nextInt();

		int mat1[][] = new int[m][n];
		int mat2[][] = new int[m][n];
		int res[][] = new int[m][n];

		System.out.println("Enter the elements of the matrix MAT1 : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat1[i][j]= in.nextInt();
				
			}System.out.println();
		}

		System.out.println("Enter the elements of the matrix MAT2 : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat2[i][j]= in.nextInt();
				
			}System.out.println();
		}

		for(int i=0;i<m;i++)
		{    
			for(int j=0;j<n;j++)
			{    
				res[i][j]=mat1[i][j]+mat2[i][j];     
				System.out.print(res[i][j]+" ");    
			}
		System.out.println();    
		}    
	}
}