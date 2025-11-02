/*for loop  ..........Loop............*/
import java.util.Scanner;
class Fact
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int fact=1;
   System.out.println("enter a number");
   int n=sc.nextInt();    
   for(int i=1;i<=n;i++)
    {
      fact=fact*i;
    }
   System.out.println("factorila is"+fact);
   }
}