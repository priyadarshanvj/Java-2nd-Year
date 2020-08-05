class fibbo_cla
{
	public static void main(String args[])
	{   
	    for(String str: args) 
		{
      
			int arm = Integer.parseInt(str);
			int a=0,b=1,c=0;
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
	}
}