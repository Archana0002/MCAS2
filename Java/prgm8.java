import java.util.Scanner;
class employee
{
    static int count=0;
    int eno;
    String ename;
    double esalary;
    Scanner sc = new Scanner(System.in);
    employee()
    {
        count++;
    }
    void getinfo()
    {
        System.out.println("Enter the details of the employee: " + count);
        System.out.println("Enter name: ");
        ename=sc.nextLine();
        System.out.println("enter the emp_no:");
        eno = sc.nextInt();
        System.out.println("enter salary:");
        esalary=sc.nextDouble();
    }
}
class Main{
    public static void main(String args[])
    {
        employee e[]=new employee[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no: of employees");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            e[i]= new employee();
            e[i].getinfo();
        }
        System.out.println("enter the employee's number to be searched:");
        int num = sc.nextInt();
        for(int i=0;i<n;i++){
            if(e[i].eno==num)
            {
                System.out.println("Employee's name is:" + e[i].ename);
            }
        }
    }
}
