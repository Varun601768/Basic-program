import java.util.Scanner;
class Happynumber
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a number");
 int n=sc.nextInt();
 int sum=0;
 while(n!=0 || sum>=9)
 {
  if(n==0)
  {
   n=sum;
   sum=0;
  }
  int temp=n%10;
  int sq=temp*temp+sum;
  n=n/10;
}
if(sum==1)
  System.out.println("Given number is Happy number");
else
  System.out.println("Given number not Happy number");
}
}