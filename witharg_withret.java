class fibbo2
{
	public int fun(int count)
	{
        if(count==0)
			return 0;
		if(count==1||count==2)
			return 1;
		else
		{
			return(fun(count-2)+fun(count-1));
		}
	}
}
public class witharg_withret
{
	public static void main(String args[])
	{   
		fibbo2 obj=new fibbo2();
		for(int i = 0; i <10; i++)
		{
			int r=obj.fun(i);
			System.out.print("\n");
			System.out.print(+r);
		}
    }
}