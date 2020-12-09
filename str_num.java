import java.util.Scanner;
class str_num
{
	public static void main(String args[])
	{
		int n,t,s=0,i=1,f=1,d;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		t=n;
		while(n!=0)
		{
			d=n%10;
			n=n/10;
			while(i<=d)
			{
				f=f*i;
				i++;
			}
			s=s+f;
		}
		if(t==s)
			System.out.println("It is a strong number"+s);
		else
			System.out.println("It is not a strong number"+s);
	}
}
