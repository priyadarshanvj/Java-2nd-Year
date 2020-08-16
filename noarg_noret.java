class fun1
{
	public void fun()
	{
		int n1=0,n2=1,n3=0,i;
		int count=10;
		System.out.println("Fibbonacci Series\n"+n1);
		System.out.println(+n2);
		for(i=3;i<=count;i++)
		{
			n3=n1+n2;
			System.out.print(+n3);
			System.out.print("\n");
			n1=n2;
			n2=n3;
		}
	}
}
public class noarg_noret
{
	public static void main(String args[])
	{
		fun1 obj = new fun1();
		obj.fun();
	}
}