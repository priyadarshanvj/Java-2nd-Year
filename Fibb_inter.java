interface Fibb
{
	void fibbo();
}
class Fibb_inter implements Fibb
{
	public void fibbo()
	{
		int a=0,b=1,c=0,arm=7;
		if(arm==1)
		System.out.println(+a);
		else if (arm==2) 
		{ 
			System.out.println(+a);
			System.out.println(+b);
		}
		else
		{
            System.out.println(+a);
			System.out.println(+b);			
			for(int i=1;i<arm;i++)
			{
				c=a+b;
				System.out.println(+c);
				a=b;
				b=c;
			}
		}
	}
	public static void main(String arg[])
	{
		Fibb obj=new Fibb_inter();
		obj.fibbo();
	}
}
