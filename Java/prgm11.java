import java.util.Scanner;
class person{
    String name;
    String gender;
    String address;
    int age;
    person(String a,String b,String c,int d)
    {
        name=a;
        gender=b;
        address=c;
        age=d;
    }
}
class employee extends person{
    int empid;
    String comp_name;
    String qualification;
    double salary;
    employee(String a,String b,String c,int d,int e,String f,String g,double h)
    {
        super(a,b,c,d);
        empid = e;
        comp_name = f;
        qualification = g;
        salary = h;
        
    }
}
class teacher extends employee{
    String subject;
    String dept;
    int teacherid;
    Scanner sc = new Scanner(System.in);
    teacher(String a,String b,String c,int d,int e,String f,String g,double h,String i,String j,int k)
    {
        super(a,b,c,d,e,f,g,h);
        subject=i;
        dept=j;
        teacherid=k;
    }
    void display()
    {
        System.out.println("TEACHER DETAILS \n");
        System.out.println("name: "+name);
        System.out.println("gender: " + gender);
        System.out.println("address: " + address);
        System.out.println("age: " + age);
        System.out.println("empid: " + empid);
        System.out.println("company name " + comp_name);
        System.out.println("qualification: " + qualification);
        System.out.println("salary: " + salary);
        System.out.println("subject: " + subject);
        System.out.println("dept: " + dept);
        System.out.println("teacherid: " + teacherid);
    }
}
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter no: of tchrs");
        int n = sc.nextInt();
        teacher t[]=new teacher[100];
        for(int i=1;i<=n;i++)
        {
            System.out.println("enter the details of " + i + "th teacher" );
            System.out.println("enter name:");
            String name=sc1.nextLine();
            System.out.println("enter gender:");
            String gender=sc1.nextLine();
            System.out.println("enter address:");
            String address=sc1.nextLine();
            System.out.println("enter age:");
            int age = sc.nextInt();
            System.out.println("enter empid:");
            int empid = sc.nextInt();
            System.out.println("enter comp_name:");
            String comp_name=sc1.nextLine();
            System.out.println("enter qualification:");
            String qualification=sc1.nextLine();
            System.out.println("enter slaary:");
            double salary = sc.nextDouble();
            System.out.println("enter subject");
            String subject = sc1.nextLine();
            System.out.println("enter dept:");
            String dept = sc1.nextLine();
            System.out.println("enter teacher id:");
            int teacherid = sc.nextInt();
            t[i]=new teacher(name,gender,address,age,empid,comp_name,qualification,salary,subject,dept,teacherid);
            
            
            
        }
        for(int i=1;i<=n;i++)
        {
            System.out.println("details of " + i + "th teacher");
            t[i].display();
        }
    }
}
