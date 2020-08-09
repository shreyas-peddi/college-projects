import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
public class currencyconvertor extends Applet implements ActionListener
{
Button b1,b2,b3,b4,b5;
TextField t1,t2,t3;
Label l1,l2,l3;
String result;
public void init()
{
b1=new Button("INR to US");
b1.setBounds(220,80,80,50);
b2=new Button("US TO INR");
b2.setBounds(220,120,80,50);
b3=new Button("INR TO UK");
b3.setBounds(220,160,80,50);
b4=new Button("INR TO AUS");
b4.setBounds(220,200,80,50);
b5=new Button("INR TO RUS");
b5.setBounds(220,240,80,50);
t1=new TextField();
t1.setBounds(220,0,100,30);
t2=new TextField();
t2.setBounds(220,40,100,30);

l1=new Label("Enter AMOUNT");
l1.setBounds(110,0,100,30);
l2=new Label("Result");
l2.setBounds(110,40,100,30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
add(b1);add(b2);add(b3);add(b4);add(b5);
add(l1);add(l2);add(t1);add(t2);
setLayout(null);
}
public void actionPerformed(ActionEvent e)
{
try
{
double a= Double.parseDouble(t1.getText());
if(e.getSource()==b1)
{
t2.setText(String.valueOf(a*0.013));
result=String.valueOf("US DOLLAR: "+a*0.013);
}
if(e.getSource()==b2)
{
t2.setText(String.valueOf(a*76.31));
result=String.valueOf("RS: "+a*76.31);
}
if(e.getSource()==b3)
{
t2.setText(String.valueOf(a*0.011));
result=String.valueOf("UK POUNDS: "+a*0.011);
}
if(e.getSource()==b4)
{
t2.setText(String.valueOf(a*0.021));
result=String.valueOf("AUS Dollar: "+a*0.021);
}
if(e.getSource()==b5)
{
t2.setText(String.valueOf(a*0.98));
result=String.valueOf("RUS ruble: "+a*0.98);
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
g.drawString(result,220,330);
}
}
