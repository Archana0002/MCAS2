import java.util.Scanner;
class product{
    int pcode;
    String pname;
    int price;
    int acceptvalues()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product name: ");
        pname=sc.nextLine();
        System.out.println("Enter product code: ");
        pcode=sc.nextInt();
        System.out.println("Enter product price: ");
        price=sc.nextInt();
        return price;
    }
    void display()
    {
        System.out.println("product code: "+pcode);
        System.out.println("product name: "+pname);
        System.out.println("product price: "+price);
        
    }
}
class Main{
    public static void main(String args[])
    {
        product p1=new product();
        product p2=new product();
        product p3=new product();
        System.out.println("product1");
        int price1=p1.acceptvalues();
        System.out.println("product2");
        int price2=p2.acceptvalues();
        System.out.println("product3");
        int price3=p3.acceptvalues();
        System.out.println("*****Lowest price*****");
        if((price1<price2)&&(price1<price3))
        {
            System.out.println("----Product1----");
            p1.display();
        }
        else if((price2<price1)&&(price2<price3))
        {
            System.out.println("----Product2----");
            p2.display();
        }
        else{
            System.out.println("----Product3----");
            p3.display();
        }
    }
}
