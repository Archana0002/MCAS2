import java.util.Scanner;
class fibonacci implements Runnable{
    int limit,a=0,b=1,c;
    fibonacci(int num)
    {
        limit=num;
    }
    public void run()
    {
        for(int i=0;i<limit;i++)
        {
            System.out.println("fibonacci numbers" + a);
            c=a+b;
            a=b;
            b=c;
        }
    }
    
}
class even implements Runnable{
    int limit;
    even(int n)
    {
        limit=n;
    }
    public void run()
    {
        for(int i=0;i<limit;i++)
        {
            if(i%2==0)
            {
                System.out.println("even numbers:" + i);
            }
        }
    }
    
}
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit of fibonacci number:");
        int fib = sc.nextInt();
        System.out.println("enter limit of even number:");
        int evn = sc.nextInt();
        fibonacci f = new fibonacci(fib);
        even e = new even(evn);
        Thread t1 = new Thread(f,"fibonacci");
        Thread t2 = new Thread(e,"even");
        System.out.println("first " + fib + "fibonacci numbers aare:");
        t1.start();
        System.out.println("first" + evn + "even numbers are:");
        t2.start();
        System.out.println("name of thread1 is " + t1.getName());
        System.out.println("name of thread 2 is " + t2.getName());
        
    }
}
