import java.util.*;

class W2Q2
{
	public static void main(String args[])
	{
		int arr[];
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of elements : ");
		int n = in.nextInt();

		arr = new int[n+1];

		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}

		System.out.print("Original array is : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		System.out.println("Enter the position and element you want to add : ");
		int pos = in.nextInt();
		int ele = in.nextInt();

		for(int i=n;i>=pos;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[pos-1]=ele;

		System.out.println("New array is : ");
		for(int i=0;i<(n+1);i++)
		{
			System.out.print(arr[i] + " ");
		}


		System.out.println("\nEnter position from which element has to be deleted");
		int k = in.nextInt();
		for(int i = k; i < n+1; i++)
			arr[i-1] = arr[i];
		arr[n]=0; 
		System.out.println("Newest array is:");
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");



	}
}