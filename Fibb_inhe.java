class Fibb
{
	int n=10;
}
class Fibbona extends Fibb
{
	void fibbo()
	{
		int a=0,b=1,c=0;
		if(n==1)
			System.out.println(+a);
		else if(n==2)
		{
			System.out.println(+a);
			System.out.println(+b);
		}
		else
		{
			System.out.println(+a);
			System.out.println(+b);
			for(int i=1;i<n;i++)
			{
				c=a+b;
				System.out.println(+c);
				a=b;
				b=c;
			}
		}
	}
}
class Fibb_inhe
{
	public static void main(String args[])
	{
		Fibbona d=new Fibbona();
		d.fibbo();
	}
}
