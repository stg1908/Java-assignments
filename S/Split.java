import java.io.*;
class Split
{
	public static void main(String arg[]) throws IOException
	{
		int x,y=0;
		int ch ;
		File f = new File(arg[0]);
		FileInputStream fis = new FileInputStream(arg[0]);
		FileOutputStream fos; 
		Console con = System.console();
		System.out.println("Enter the size of File");
		long i = Long.parseLong(con.readLine());
		long l = f.length();
		long n = Math.round((((double)l)/((double)i)));
		for(x=1;x<=n;x++)
		{
			fos = new FileOutputStream("a"+x+".txt");
			for(y=1;y<=i;y++)
			{
					
				if((ch=fis.read())!=-1)
				{
					fos.write(ch);
						
				}
			}
				
			fos.close();
		}
		fis.close();
		f.delete();
			 
		
	}	
}
