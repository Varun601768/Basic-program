import java.util.Scanner;
class tr1
{
 public static void main(String args[])
 {
  int n=5,star=2*n-1,space=0;
  for(int i=0;i<n;i++)
  {
     for(int k=0;k<space;k++)
     {
       System.out.print(" "+"\t");
     }
     for(int j=0;j<star;j++)
    {
      System.out.print("*"+"\t");
    }
   space++;
   star=star-2;
   System.out.println("\n");
  }
}
}