class arg
{
  public static void main(String args[])
  {
    
    con a = new con(20, "archana");
    con b = new con(20, "ajay", 40);
    
    
  }
}

class con
{
  
  
  con(int i, String k)
  {
  	int a = i;
 	String c = k;
 	
 	System.out.println(a+"\n"+c);
  }
  
  con(int i, String k, double mark)
  {
  	int a = i;
 	String c = k;
 	double m = mark;
 	System.out.println(a+"\n"+c + "\n"+m );
  }
}
  
