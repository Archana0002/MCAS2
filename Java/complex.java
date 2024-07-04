class comp
{
  double real;
  double imag;
  comp(double s,double b)
  {
    real = s;
    imag = b;
  }
}

class complex
{
  public static void main(String args[])
  {
    comp c1 = new comp(2.1,4.3);
    comp c2= new comp(1.0,4.0);
    comp result;
    result = add(c1,c2);
    System.out.println("\n \t Sum is " + result.real + "+" + result.imag + "i");
    
  }
  static comp add(comp n1,comp n2)
  {
    comp res = new comp(0.0,0.0);
    res.real = n1.real + n2.real;
    res.imag = n1.imag + n2.imag;
    System.out.println("Complex number:\t" + n1.real + "+" + n1.imag + "i");
    System.out.println("Complex number:\t" + n2.real + "+" + n2.imag + "i");
    return res;
  }
}
