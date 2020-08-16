class fibbo3
{ 
	public void fun(int n)
	{
		int n1=0,n2=1,n3=0,i;
		System.out.println("Fibbonacci Series\n"+n1);
		System.out.println(+n2);
		for(i=3;i<=n;i++)
		{
			n3=n1+n2;
			System.out.print(+n3);
			System.out.print("\n");
			n1=n2;
			n2=n3;
		}
	}
}
public class witharg_noret
{
	public static void main(String args[])
	{
		fibbo3 obj=new fibbo3();
		obj.fun(10);
	}
}