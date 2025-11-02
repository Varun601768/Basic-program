import java.util.Scanner;
class tr2
{
 public static void main(String args[])
 {
  int n=5,star=1,space=n-1;
  for(int i=0;i<n;i++)
  {
     for(int k=0;k<star;k++)
     {
       System.out.print("*"+"\t");
     }
     for(int j=0;j<space;j++)
    {
      System.out.print(" "+"\t");
    }
   space--;
   star=star+2;
   System.out.println("\n");
  }
}
}

/*  
*

*       *       *

*       *       *       *       *

*       *       *       *       *       *       *

*       *       *       *       *       *       *       *       *

*/