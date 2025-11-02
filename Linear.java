/*.........Linear Search ............*/
import java.util.Scanner;
class Linear
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size");
  int size=sc.nextInt();
  int[] arr=new int[size];
  int i;
  System.out.println("enter number elements");
  for(i=0;i<arr.length;i++)
    arr[i]=sc.nextInt();
  System.out.println("enter search key");
  int key=sc.nextInt();
  Boolean isflag=false;
  for(i=0;i<arr.length;i++)
  {
   if(arr[i]==key)
      isflag=true;
  }
if(isflag)
  System.out.println("item found at position"+i);
else  
 System.out.println("item is not found");
  
}
}
