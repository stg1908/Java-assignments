import java.awt.*;
import java.awt.event.*;
class Draw extends Frame implements MouseMotionListener
{
	//Frame f;
	//Label l1,l2;
	//TextArea ta1;
	//TextField tf1,tf2;
	//Panel p1,p3;
	static int x1=0,y1=0,m=0;
	public void mouseMoved(MouseEvent e)
	{
		m=0;
	}
	public void mouseDragged(MouseEvent e)
	{
		int x,y;
		Dimension d = this.getSize();
		x=e.getX(); y=e.getY();
		//tf1.setText(""+x); tf2.setText(""+y);
		Graphics g = getGraphics();
		g.setColor(Color.red);
		if(m==0)
		{
			g.drawLine(x,y,x,y);
			x1=x;
			y1=y;
			m++;
		}
		else
		{
			g.drawLine(x1,y1,x,y);
			x1=x;
			y1=y;
		}
		//System.out.println(x+","+y+","+x1+","+y1);
		//g.setColor(Color.blue);
		//g.drawLine(x,y,x1,y1);
		//g.setColor(Color.green);
		//g.drawLine(x,y,d.width,0);
		//g.setColor(Color.black);
		//g.drawLine(x,y,d.width,d.height);
	}
	
	public static void main(String arg[])
	{
		Draw p = new Draw();
		p.setSize(600,300);
		//x1=p.getX(); y1=p.getY();
		p.addMouseMotionListener(p);
		p.setVisible(true);
	}
}
