import java.awt.*;
import java.awt.event.*;
class Col implements AdjustmentListener
{	
	Frame f;
	Scrollbar s1,s2,s3;
	Panel p1,p2,p3;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	public Col()
	{
		f = new Frame();
		f.setSize(600,300);
		f.setLayout(new BorderLayout());
		s1 = new Scrollbar(Scrollbar.VERTICAL,0,1,0,256);
		s2 = new Scrollbar(Scrollbar.VERTICAL,0,1,0,256);
		s3 = new Scrollbar(Scrollbar.VERTICAL,0,1,0,256);
		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);
		l1 = new Label("Red");
		l2 = new Label("Green");
		l3 = new Label("Blue");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		p1 = new Panel();
		p2 = new Panel(new GridLayout(1,6));
		p3 = new Panel();
		p1.setLayout(new GridLayout(1,3));
		p1.add(s1);p1.add(s2);p1.add(s3);
		f.add(p1,"East");
		p2.add(l1); p2.add(t1); p2.add(l2); p2.add(t2); p2.add(l3); p2.add(t3);
		f.add(p2,"South");
		f.add(p3);
		f.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		int v1,v2,v3;
		v1=s1.getValue();
		v2=s2.getValue();
		v3=s3.getValue();
		t1.setText(""+v1); t2.setText(""+v2); t3.setText(""+v3);
		p3.setBackground(new Color(v1,v2,v3));
	}
	public static void main (String arg[])
	{
		Col c = new Col();
	}
	
}
