import java.io.*;
class file17
{
  public static void main(String args[]) throws IOException
  {
     FileReader fr = new FileReader("integers.txt");
     BufferedReader bc = new BufferedReader(fr);
     FileWriter fw = new FileWriter("even.txt");
     BufferedWriter bw = new BufferedWriter(fw);
     FileWriter fw1 = new FileWriter("odd.txt");
     BufferedWriter bw1 = new BufferedWriter(fw1);
     String s;
     int n;
     while((s=bc.readLine())!=null)
     {
	n=Integer.parseInt(s);
	if(n%2==0)
	{
	  bw.write(s);
	  bw.write("\n");
	}
	     
        else
        {
	   bw1.write(s);
	   bw1.write("\n");
        }
     }
     bw.close();
     bw1.close();
  }
}


