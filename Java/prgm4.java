import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        int row,col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        row = sc.nextInt();
        System.out.println("enter no: of columns");
        col=sc.nextInt();
        int[][] m1=new int[row][col];
        int[][] m2=new int[row][col];
        int[][] m3=new int[row][col];
        System.out.println("Enter the 1st matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                m2[i][j]=sc.nextInt();
            }
        }
        System.out.println("1st matrix is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println(m1[i][j]);
            }
        }
        System.out.println("2nd matrix is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println(m2[i][j]);
            }
        }
        //to add
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                m3[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("added matrix is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(m3[i][j]+"\t");
            }
           System.out.println();
        }
    }
    
}
