import java.util.Scanner;
class area{
    final double pi=3.14;
    void ar(int r){
        System.out.println("area of circle is: " + pi*r*r);
    }
    void ar(int l,int b){
        System.out.println("Area of rectangle is: "+l*b);
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        area a = new area();
        int ch;
        do{
            System.out.println("1.circle \n 2.rectangle \n 3.exit \n Enter the choice");
            ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("Enter radius: ");
                int r=sc.nextInt();
                a.ar(r);
            }
            else if(ch==2)
            {
                System.out.println("Enter length: ");
                int l = sc.nextInt();
                System.out.println("Enter breadth: ");
                int b = sc.nextInt();
                a.ar(l,b);
            }
            else if(ch==3)
            {
                System.out.println("\n Exiting");
                break;
            }
            else{
                System.out.println("Invalid choice");
            }
            
        }
        while(ch!=3);
    }
}
