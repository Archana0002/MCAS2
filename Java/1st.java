import java.util.Scanner;
class student
{
    int roll;
    String name;
    float mark;
    
    void show()
    {
        System.out.println("non static");
        System.out.println(roll);
        System.out.println(name);
        System.out.println(mark);
    }
    
    public static void show1()
    {
        System.out.println("static");
        
    }
}

public class demo
{
    
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        System.out.println("Enter roll_no:");
        s1.roll=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        s1.name=sc.nextLine();
        System.out.println("Enter mark:");
        s1.mark=sc.nextFloat();
        s1.show();
        student.show1();
    }
}
