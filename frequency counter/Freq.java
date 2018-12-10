import java.util.*;
import java.io.*;
class Freq
{
	public static void main(String arg[]) throws IOException
	{
		int ch,i=0;
		String str= "";
		FileInputStream fis = new FileInputStream(arg[0]);
		
		StreamTokenizer st = new StreamTokenizer(fis);
		HashMap map = new HashMap();
		HashSet set = new HashSet(); 
		while(st.nextToken()!=StreamTokenizer.TT_EOF)
		{
			//System.out.println(st.sval+"ss");
			switch(st.ttype)
			{
				case StreamTokenizer.TT_EOL:	str = "Number Of Lines" ;
								break;
				case StreamTokenizer.TT_NUMBER: str = st.nval+"" ;
								break;
				case StreamTokenizer.TT_WORD: str = st.sval ;
								break;
				default: str = "" + ((char)st.ttype);
			}
			if(!set.contains(str))
			{
				//System.out.println(st.sval+"ss");
				set.add(str);
				map.put(str,1);
			}
			else
			{
				//System.out.println(st.sval+"ss");
				map.put(str,(int)map.get(str)+1);
			}
		}
		Iterator iter = set.iterator();
		String s;
		while(iter.hasNext())
		{
			s = (String)iter.next();
			System.out.println(s+" : "+(int)map.get(s));
		}
	}
}
