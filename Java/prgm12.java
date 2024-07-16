import java.util.*;
class student
{
    int roll;
    String name;
    Double mark;
    Scanner sc = new Scanner(System.in);
    void getstudent()
    {
        System.out.println("enter student details:");
        System.out.println("enter name:");
        name = sc.nextLine();
        System.out.println("enter roll_no:");
        roll =sc.nextInt();
        System.out.println("mark:");
        mark=sc.nextDouble();
    }
}
class sports extends student
{
    Double sportsscores;
    Scanner sc = new Scanner(System.in);
    void getsports()
    {
        System.out.println("enter score:");
        sportsscores = sc.nextDouble();
    }
}
class result extends sports{
    void display()
    {
        System.out.println("roll_no: is" + roll);
        System.out.println("name is" + name);
        System.out.println("marks is:" +  mark);
        System.out.println("sports score is" + sportsscores);
    }
}
class Main{
    public static void main(String args[])
    {
        result r = new result();
        r.getstudent();
        r.getsports();
        r.display();
    }
}
