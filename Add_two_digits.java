import java.util.Scanner;
public class Add_two_digits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,n1,s;
		int d=0,e=0;
		System.out.println("Enter 1st Number:");
		n=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		n1=sc.nextInt();
		d=n%10;
		e=n1%10;
		s=d+e;
		System.out.println("The sum is: "+s);
	}
}