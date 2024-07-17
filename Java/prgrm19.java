import java.io.*;
import java.util.*;
class file16
{
   public static void main(String args[]) throws IOException
   {
	Scanner sc = new Scanner(System.in);
	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	FileWriter f = new FileWriter("input.txt");
	BufferedWriter bw = new BufferedWriter(f);
	System.out.println("enter number of lines:");
	int n = sc.nextInt();
	System.out.println("enter content:");
	String s;
	int i=0;
	do
	{
	  if(i==n)
		break;
	  s=br.readLine();
	  bw.write(s);
	  bw.write("\n");
	  i++;
	}
	  while(true);
	bw.close();
	FileReader fr = new FileReader("input.txt");
	BufferedReader bfr = new BufferedReader(fr);
	String str;
	System.out.println("\n...The file is...\n");
	while((str=bfr.readLine())!=null)
	{
	    System.out.println(str);
	}
	bfr.close();
   }
}
