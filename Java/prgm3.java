class comp
{
    double real;
    double imag;
    comp(double s,double b)
    {
        real=s;
        imag=b;
    }
}
class Main
{
    public static void main(String args[])
    {
        comp c1=new comp(1.2,3.3);
        comp c2=new comp(3.8,3.6);
        comp result=add(c1,c2);
        System.out.println("Sum is: " + result.real + "+" + result.imag + "i");
    }
    static comp add(comp n1,comp n2)
    {
        comp res=new comp(0.0,0.0);
        res.real=n1.real+n2.real;
        res.imag=n1.imag+n2.imag;
        System.out.println("Complex number1 is: "+n1.real+"+"+n1.imag+"i");
        System.out.println("Complex number2 is: "+n2.real+"+"+n2.imag+"i");
        
        return res;
    }
}
