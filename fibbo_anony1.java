abstract class Anonymous {
	public abstract void fibonacci();
}
public class fibbo_anony1{
	public static void main(String[] args){
		Anonymous f1 = new Anonymous(){
			public void fibonacci()
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
	};
	f1.fibonacci();
}
}