import java.util.Scanner;
interface measurement{
    public void area();
    public void perimeter();
    public void input(Scanner s);
}
class circle implements measurement
{
    int r;
    public void input(Scanner s)
    {
        System.out.println("enter radius: ");
        r=s.nextInt();
        area();
        perimeter();
    }
    public void area()
    {
        System.out.println("area of circle :" + 3.14*r*r);
    }
    public void perimeter(){
        System.out.println("perimeter of circle is "+2*3.14*r);
        }
}

class rectangle implements measurement
{
    int l;
    int b;
    public void input(Scanner s)
    {
        System.out.println("Enter length: ");
        l=s.nextInt();
        System.out.println("Enter breadth: ");
        b=s.nextInt();
        area();
        perimeter();
    }
    public void area(){
        System.out.println("Area of rectangle is: " + l*b);
    }
    public void perimeter(){
        System.out.println("perimeter of rectangle is: "+2*(l+b));
    }
}

class Main{
    public static void main(String args[])
    {
        circle c = new circle();
        rectangle r = new rectangle();
        Scanner s = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.circle \n 2.recatangle \n 3.exit \n Enter your choice: ");
            ch=s.nextInt();
            if(ch==1){
                c.input(s);
            }
            else if(ch==2){
                r.input(s);
            }
            else if(ch==3){
                System.out.println("Exiting");
                break;
            }
            else{
                System.out.println("invalid");
            }
        }
        while(ch!=0);
    }
}
