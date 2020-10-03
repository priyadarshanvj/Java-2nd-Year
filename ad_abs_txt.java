import java.io.*;
import java.util.Scanner;
abstract class add
{
	public abstract int addi();
}
public class ad_abs_txt extends add
{
	public int addi()
	{
		try{
		File file = new File("E:\\Java lockdown\\Input.txt");
		Scanner s=new Scanner(file);
		float l,m;
		l=s.nextFloat();
		m=s.nextFloat();
		float c;
		c=l+m;
		FileOutputStream fout=new FileOutputStream("E:\\Java lockdown\\Output.txt");
		DataOutputStream dos=new DataOutputStream(fout);
		dos.writeFloat(c);
		System.out.println(+c);
		dos.close();
		}
		catch(IOException e){}
		return 0;
	}
	
	public static void main(String args[])throws IOException
	{ 
		add obj=new ad_abs_txt();
		obj.addi();	
	}
}
		

