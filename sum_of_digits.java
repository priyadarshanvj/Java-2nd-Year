import java.util.Scanner;
public class sum_of_digits
{
	public static void main(String args[])
	{
		int n,s=0,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		n=sc.nextInt();
		sc.close();
		while(n!=0)
		{
			d=n%10;
			s=s+d;
			n=n/10;
		}
	System.out.println("The sum is :"+s);
	}
} 