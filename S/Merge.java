import java.io.*;
class Merge
{
	public static void main(String arg[]) throws IOException
	{
		int x,y=0;
		int ch ;
		File f ;
		FileOutputStream fos = new FileOutputStream(arg[0]);
		FileInputStream fis; 
		//Console con = System.console();
		//System.out.println("Enter the size of File");
		//long i = Long.parseLong(con.readLine());
		//long l = f.length();
		//long n = (l/i)+1;
		//File f ;
		for(x=1;;x++)
		{
			f = new File("a"+x+".txt");
			if(f.exists())
			{	
				fis = new FileInputStream(f);
				for(y=1;y<=f.length();y++)
				{
					if((ch=fis.read())!=-1)
					{
						fos.write(ch);
					}
				}
				fis.close();
				f.delete();
			}
			else
			{
				fos.close();
				break;
				
			}
		}
		
		
	}
}
