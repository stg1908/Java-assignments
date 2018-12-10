import java.io.*;
class Dvd implements Item
{
	private String title;
	private String direc;
	private String categ;
	
	public void read()
	{
		Console con = System.console();
		System.out.print("Enter title of DVD :");
		title=con.readLine();
		System.out.print("Enter director's name :");
		direc=con.readLine();
		System.out.print("Enter category :");
		categ=con.readLine();
		
	}
	public void show()
	{
		System.out.println("DVD : "+title+"    "+"Director : "+direc+"    "+"Category : "+categ);
	}
	
}
