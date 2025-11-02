import java.util.Scanner;
class Remove
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int[] arr=new int[4];
   System.out.println("enter a number");
   for(int i=0;i<arr.length;i++)
   {
    arr[i]=sc.nextInt();
   }
   for(int i=0;i<arr.length;i++)
   {
     Boolean isflag=false;
   for(int j=0;j<i;j++)
   {
     if(arr[i]==arr[j])
       isflag=true;
       break;
    }
  if(!isflag)
   System.out.println(arr[i]+"");
}
}
}
