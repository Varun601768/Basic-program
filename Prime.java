import java.util.Scanner;
class Prime
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   Boolean isprime=true;
   System.out.println("enter a number");
     int n=sc.nextInt();
   if(n<=1)
     isprime=false;
   for(int i=2;i<=n/2;i++)
   {
     if(n%i==0)
      isprime=false;
      break;
   }
  

if(!isprime)
  System.out.println("Given number is not a Prime number..");
else
  System.out.println("Given number is Prime number..");
}
}
