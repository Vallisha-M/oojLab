import java.util.Scanner;
class third
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = in.nextInt();
		System.out.print("Enter second number : ");
		int b = in.nextInt();
		System.out.println("The prime numbers are ; ");
		for(int i = a; i<=b; i++)
			if(isPrime(i))
				System.out.print(i+" ");
	}
	public static boolean isPrime(int a)
	{
		boolean flag = true;
		if(a==2)
			return flag;
		for(int i = 2 ; i < a ; i++)
			if(a%i==0)
			{
				flag = false;
				break;
			}
		return flag;
	}
}