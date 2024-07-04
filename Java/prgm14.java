import java.util.Scanner;
class loginfailedexception extends Exception
{
    loginfailedexception(String str)
    {
        super(str);
    }
}
class Main{
    
    static void validate(String u,String p) throws loginfailedexception
    {
        String username="archana";
        String password="123456";
        if(username.equals(u)&&password.equals(p))
        {
            System.out.println("login success");
        }
        else{
            throw new loginfailedexception("login failed");
        }
    }
    
    public static void main(String args[])
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter username:");
            String uname = sc.nextLine();
            System.out.println("enter password:");
            String pword = sc.nextLine();
            validate(uname,pword);
        } catch(loginfailedexception e) {
            System.out.println(e);
        }
    }
}
