import java.util.Scanner;
class negexception extends Exception
{
    negexception(String s)
    {
        super(s);
    }
}
class Main{
    public static void main(String args[])
    {
        int num[] = new int[10];
        Scanner sc = new Scanner(System.in);
        double avg=0.0;
        System.out.println("enter the limit");
        int n = sc.nextInt();
        System.out.println("enter the numbers:");
        for(int i=1;i<=n;i++)
        {
            num[i]=sc.nextInt();
            try{
                if(num[i]<0)
                {
                    i--;
                    throw new negexception("enter number is Negative. Please enter positive number");
                }
                else{
                    avg=avg+num[i];
                }
            }
            catch(negexception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("average is: "+avg);
    }
}
