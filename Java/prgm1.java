import java.util.Scanner;
class Main{
    int roll;
    String name;
    float mark;
    void showdetails(){
        System.out.println("Non static method");
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + roll);
        System.out.println("Mark: " + mark);
    }
    static void show(){
        System.out.println("static method");
    }
    public static void main(String args[]){
        try{
        Scanner sc = new Scanner(System.in);
        Main s1=new Main();
        System.out.println("Enter name: ");
        s1.name=sc.nextLine();
        System.out.println("Enter the roll-no: ");
        s1.roll=sc.nextInt();
         
        System.out.println("Enter mark: ");
        s1.mark=sc.nextFloat();
        s1.showdetails();
        show();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
    }
}
