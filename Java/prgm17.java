import java.awt.*;
import java.awt.event.*;
public class comp17 extends Frame implements ActionListener
{
  Label l1,l2,l3,l4;
  TextField t1,t2,t3,t4;
  Button b1;
  comp17()
  {
    setLayout(new FlowLayout());
    l1=new Label("num1");
    t1=new TextField(10);
    l2=new Label("num2");
    t2=new TextField(10);
    l3=new Label("num3");
    t3=new TextField(10);
    b1=new Button("Largest");
    l4=new Label("result");
    t4=new TextField(10);
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(b1);
    b1.addActionListener(this);
    add(l4);
    add(t4);
  }
  public void actionPerformed(ActionEvent ae)
  {
    int a,b,c,large;
    if (ae.getSource()==b1)
    {
      a=Integer.parseInt(t1.getText());
      b=Integer.parseInt(t2.getText());
      c=Integer.parseInt(t3.getText());
      large=0;
      if(a>b&&a>c)
      {
        large=a;
      }
      else if(b>c&&b>a)
        large=b;
      else
        large=c;
      String result=String.valueOf(large);
      t4.setText(result);
    }
  }
  public static void main(String arg[])
  {
   comp17 obj=new comp17();
   obj.setSize(500,400);
   obj.setVisible(true);
  }
}
    
    
