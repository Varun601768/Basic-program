import java.util.Scanner;
class secondMax
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
   int max=Integer.MIN_VALUE;
   int second_max=Integer.MIN_VALUE; /*arr[0];*/
   for(int i=0;i<arr.length;i++)
   {
    if(arr[i]>max)
    {
      max=second_max;
    }
    if(arr[i]>second_max)
    {
      second_max=arr[i];
    }
}
System.out.println(max);
System.out.println(second_max);
}
}
