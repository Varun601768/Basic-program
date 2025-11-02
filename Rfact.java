/*..........Recusrion............*/

import java.util.Scanner;
class Rfact
{
 public static int fact(int n)
 {
   if(n<=1)
      return 1;
   else
      return n*fact(n-1);

}
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int fact=1;
   System.out.println("enter a number");
   int n=sc.nextInt(); 
   int res=fact(n);
   System.out.println("factroial of number"+res);   
   }
}