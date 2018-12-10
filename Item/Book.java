import java.io.*;
class Book implements Item
{
	private String title;
	private String author;
	private String publi;
	public void read()
	{
		Console con = System.console();
		System.out.print("Enter title of book :");
		title=con.readLine();
		System.out.print("Enter author's name :");
		author=con.readLine();
		System.out.print("Enter publication :");
		publi=con.readLine();
		
	}
	public void show()
	{
		System.out.println("Book : "+title+"    "+"Author : "+author+"    "+"Publication : "+publi);
	}
	
}
