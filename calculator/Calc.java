import java.awt.*;
import java.awt.event.*;
class Calc implements ActionListener
{
	int var=0,xy=0;
	char o='h',m='n';
	double num = 0,ans=0;
	Frame f;
	Panel p1;
	Panel p[] = new Panel[4];
	Button b[] = new Button[16];
	TextField t;	
	public Calc()
	{
		int i,j=0,n;
		f = new Frame();
		f.setSize(600,400);
		f.setLayout(new GridLayout(5,1));
		GridLayout g = new GridLayout(1,4);
		p1 = new Panel();
		//Panel p[] = new Panel[4];
		p1.setLayout(new BorderLayout());
		for(i=0;i<4;i++)
		{
			p[i]=new Panel();
			p[i].setLayout(g);
		}
		//Button b[] = new Button[16];	
		b[0] = new Button("1");
		b[1] = new Button("2");
		b[2] = new Button("3");
		b[3] = new Button("+");
		b[4] = new Button("4");
		b[5] = new Button("5");
		b[6] = new Button("6");
		b[7] = new Button("-");
		b[8] = new Button("7");
		b[9] = new Button("8");
		b[10] = new Button("9");
		b[11] = new Button("*");
		b[12] = new Button("c");
		b[13] = new Button("0");
		b[14] = new Button("/");
		b[15] = new Button("=");
		for(i=0;i<16;i++)
		{
			b[i].addActionListener(this);
		}
		t = new TextField();
		p1.add(t);
		for(i=0;i<4;i++)
		{
			n=j+4;
			for(;j<n;j++)
			{
				p[i].add(b[j]);
			}
		}
		f.add(p1);
		for(i=0;i<4;i++)
		{
			f.add(p[i]);
		}
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		//System.out.print(ans);
		String str = e.getActionCommand();
		char ch = str.charAt(0);
		if(Character.isDigit(ch))
		{
			
			num=num*10+Character.getNumericValue(ch);
			t.setText(""+num);
			m='h';
			
		}
		//System.out.print("r");
		if(ch=='c')
		{
			t.setText("0");
			num=0;
			ans=0;
			m='n';
			xy=0;
			//return;
		}	
		if(ch=='=')
		{
			//System.out.print(o);
			if(o!='h')
				solv();
			m='n';
			num=0;
			if(xy==1)
				t.setText(""+ans);
			
		}
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
		{
			xy=1;
			if(o!='h'&&m=='h')
			{
				System.out.println(o+"a"+m);
				solv();
				o=ch;
				num=0;
				return;
			}
			ans=Double.parseDouble(t.getText());
			num=0;
			//t.setText("0");
			m='n';
			o=ch;
		}
	}
	public void solv()
	{
		m='n';
		switch(o)
		{
			case '+' :		ans=ans+num;
						//System.out.print(ans);
						o='h';
						break;
			case '-' :		ans=ans-num;
						o='h';
						break;
			case '*' :		ans=ans*num;
						o='h';
						break;
			case '/' :		ans=ans/num;
						o='h';		
		}
		t.setText(""+ans);
	}
	public static void main (String arg[])
	{
		Calc c = new Calc();
		
		
	}
	
}
