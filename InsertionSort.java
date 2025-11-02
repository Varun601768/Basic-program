import java.util.Scanner;
class InsertionSort
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a size");
  int size=sc.nextInt();
  int[] a=new int[size];
  System.out.println("enter a elements");
  for(int i=0;i<a.length;i++)
   a[i]=sc.nextInt();
  for(int i=1;i<a.length;i++)
  {
   int key=a[i];
   int j=i-1;
    while(j>=0 && a[j]>key)
    {
      a[j+1]=a[j];
      j--;
    }
    a[j+1]=key;
  }

 System.out.println("After Sorting");
 for(int i=0;i<a.length;i++)
  System.out.println(a[i]);
}
}