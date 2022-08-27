import java.util.Scanner;
class W1A1
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int num = sc.nextInt();

			int result = is_Armstrong(num);

			if(result == 1)
				System.out.println("Given number is an armstrong number ");
			else
				System.out.println("Given number is not an armstrong number ");
			}

			static int is_Armstrong(int num)
			{
				int sum=0,cub,rem,orig;

				orig=num;

				while(num != 0)
				{
					rem = num%10;
					sum = sum + rem*rem*rem;
					num = num/10;
				}

				if (sum == orig)
					return 1;
				else
					return 0;
			}
}