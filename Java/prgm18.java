// calculator using awt in java

import java.awt.*;
import java.awt.event.*;

public class cal_frame extends Frame implements ActionListener
{
  
  TextField t1,t2,t3;
  Label l1,l2,l3;
  Button b1,b2,b3,b4;
  
  cal_frame()
  {
   
   setLayout(new FlowLayout());
   
   t1 = new TextField(10);
   t2 = new TextField(10);
   t3 = new TextField(10);
 
   l1 = new Label("first No");
   l2 = new Label("Second No");
   l3 = new Label("Result");
   
   b1= new Button("+");
   b2= new Button("-");
   b3= new Button("*");
   b4= new Button("/");
   
   add(l1);
   add(t1);
   
   add(l2);
   add(t2);
   
   add(l3);
   add(t3);
   add(b1);
   add(b2);
   add(b3);
   add(b4);
   t1.setText("");
   t2.setText("");
   t3.setText("");
   
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
    int a,b,ve=0;
    a=Integer.parseInt(t1.getText());
    b=Integer.parseInt(t2.getText());
    if(ae.getSource()==b1)
    {
     ve=a+b;
     t3.setText("number:"+ve);
    }
    else if(ae.getSource()==b2)
    {
      ve=a-b;
      t3.setText("number:"+ve);
    }
    else if(ae.getSource()==b3)
    {
      ve=a*b;
      t3.setText("number:"+ve);
    }
    else if(ae.getSource()==b4)
    {
      if(b==0)
      {
        t3.setText("division not posiible");
      }
      else
      {
        Double r=a/(b*1.0);
        t3.setText("number:"+r);
    }
   }
 }
public static void main(String args[])
{
  cal_frame f = new cal_frame();
  f.setTitle("calculator");
  f.setSize(200,300);
  f.setVisible(true);
}
}
   
     
