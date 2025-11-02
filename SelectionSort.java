import java.util.Scanner;
class SelectionSort
{
 public static void main(String args[])
 {
  Scanner sc =new Scanner(System.in);
  System.out.println("enter a size");
  int size=sc.nextInt();
  int[] a=new int[size];
  System.out.println("Enter the element");
  for(int i=0;i<a.length;i++)
  a[i]=sc.nextInt();
  
  for(int i=0;i<a.length;i++)
  { 
   int min=i;
   for(int j=i+1;j<a.length;j++)
   {
    if(a[j]>a[min])
     min=j;
   }
  int temp=a[i];
    a[i]=a[min];
    a[min]=temp;
  }
 System.out.println("After Sorting");
 for(int i=0;i<a.length;i++)
  System.out.println(a[i]);
 }
}