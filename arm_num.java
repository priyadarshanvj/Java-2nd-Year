import java.util.Scanner;
class arm_num
{
	public static void main(String args[])
	{
		int n,s=0,t,d;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		t=n;
		while(n!=0)
		{
			d=n%10;
			s=s+(d*d*d);
			n=n/10;
		}
		if(t==s)
			System.out.println("It is an armstrong number");
		else
			System.out.println("It is not an armstrong number");
	}
}