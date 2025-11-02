import java.util.Scanner;
class Fibonacci
{
 public static void main(String args[])
 {
   int f1=0,f2=1,f3=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number");
     int n=sc.nextInt();
   System.out.println("Fibonacci Numbers are..");
   for(int i=1;i<n;i++)
   {
    f3=f1+f2;
    System.out.println(f3);
    f1=f2;
    f2=f3;
    }
}
}
