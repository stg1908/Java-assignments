import java.io.*;
class Lib
{
	public static void main(String arg[])
	{
		int i=0;
		char c;
		Item a[]=new Item[4];
		Console con = System.console();
		
		while(i<a.length)
		{
			System.out.print("book or Dvd<b/d>:");
			c=con.readLine().charAt(0);
			if(c=='b')
			{
				a[i]=new Book();
				a[i].read();
			}
			else
			{
				a[i]=new Dvd();
				a[i].read();
			}
			i++;
		}
		System.out.println("List of issued items from library");
		for(Item v : a) v.show();
	} 
	
}
