import java.util.Scanner;
class comp{
    double real;
    double imag;
    comp(double r,double i)
    {
        real=r;
        imag=i;
    }
}
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter real part for complex number 1");
        double r1 = sc.nextDouble();
        System.out.println("enter imaginary part for complex number1:");
        double m1 = sc.nextDouble();
        System.out.println("enter real part for complex number 1");
        double r2 = sc.nextDouble();
        System.out.println("enter imaginary part for complex number1:");
        double m2 = sc.nextDouble();
        
        comp c1 = new comp(r1,m1);
        comp c2 = new comp(r2,m2);
        comp result;
        result = add(c1,c2);
        System.out.println("\n \t sum is " + result.real + "+" + result.imag + "i" );
    }
    static comp add(comp n1,comp n2)
    {
        comp res = new comp(0.0,0.0);
        res.real = n1.real + n2.real;
        res.imag = n1.imag + n2.imag;
        System.out.println("complex number 1 is:\t" + n1.real + "+" + n1.imag);
        System.out.println("complex number 2 is: \t" + n2.real + "+" + n2.imag);
        return res;
    }
}
