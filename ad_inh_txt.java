import java.io.*;
import java.util.Scanner;
class add
{
	void addi()
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
	
	}
}
class ad_inh_txt extends add 
{
	public static void main(String args[])throws IOException
	{ 
		add obj=new ad_inh_txt();
		obj.addi();	
	}
}

		

