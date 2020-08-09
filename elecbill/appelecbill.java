import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
public class appelecbill extends Applet implements ActionListener
    {
    Button b1;
    TextField tnac,thac,tnfan,thfan,tnlight,thlight;
    Label l1,l2,l3,l4;
    String result;
    public void init()
    {
    b1=new Button("submit");
    b1.setBounds(200,250,90,50);
    
    tnac=new TextField();
    tnac.setBounds(110,30,100,30);
    thac=new TextField();
    thac.setBounds(330,30,100,30);
    tnfan=new TextField();
    tnfan.setBounds(110,80,100,30);
    thfan=new TextField();
    thfan.setBounds(330,80,100,30);
    tnlight=new TextField();
    tnlight.setBounds(110,130,100,30);
    thlight=new TextField();
    thlight.setBounds(330,130,100,30);
    
    l1=new Label("No.of ac");
    l1.setBounds(0,30,100,30);
    l2=new Label("No.of fan");
    l2.setBounds(0,80,100,30);
    l3=new Label("no. of light");
    l3.setBounds(0,130,100,30);
    l4=new Label("avg no. of hours of usage of each per month");
    l4.setBounds(330,0,300,30);
    b1.addActionListener(this);
    
    add(b1);
    add(tnac);add(thac);add(tnfan);add(thfan);add(tnlight);add(thlight);
    add(l1);add(l2);add(l3);add(l4);
    setLayout(null);
    }
    public void actionPerformed(ActionEvent e)
    {
    double units=0,billpay=0;
    try
    {
        int nac=Integer.parseInt(tnac.getText());
        int hac=Integer.parseInt(thac.getText());
        int nfan=Integer.parseInt(tnfan.getText());
        int hfan=Integer.parseInt(thfan.getText());
        int nlight=Integer.parseInt(tnlight.getText());
        int hlight=Integer.parseInt(thlight.getText());
        units=nac*1.5*hac+nfan*hfan*0.08+nlight*nfan*0.0416;
        if(e.getSource()==b1)
        {
         if(units<100)
        	 {
        	      billpay=units*2.65;
        	  }
        	else if(units<300)
        	 {
        	   billpay=100*2.65+(units-100)*7.1;
        	 }
        	else if(units>300)
        	{
        	    billpay=100*2.65+200*7.1+(units-300)*9.05;
        	}
        result=String.valueOf("Amount of units consumed "+units+" Bill to pay : " + billpay);
        }
        repaint();
        }
        catch(Exception ex)
        {
        result="Enter integer value ";
        repaint();
    }
    }
    public void paint(Graphics g)
    {
    g.drawString(result,170,200);
    }
}
