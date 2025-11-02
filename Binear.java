/*.........Binear Search ............*/
import java.util.Scanner;
class Binear
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size");
  int size=sc.nextInt();
  int[] arr=new int[size];
  System.out.println("enter number elements");
  for(int i=0;i<arr.length;i++)
    arr[i]=sc.nextInt();
  System.out.println("enter search key");
  int key=sc.nextInt();
 int low=0;
 int high=arr.length-1;
 Boolean isflag=false;
 while(low<=high)
 {
   int mid=(low+high)/2;
   if(arr[mid]==key)
    {
      System.out.println("item found at position"+mid);
       isflag=true;
       break;
    }
   if(arr[mid]>key)
   {
      high=mid-1;
   }   
    else
     {
      low=mid+1;
  }     
  
 }
if(!isflag)
  System.out.println("item not found");
}
}