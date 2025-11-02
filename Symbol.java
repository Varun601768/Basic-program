class Symbol
{
 public static void main(String args[])
 {
  int n=5;
  for(int i=1;i<=n;i++)
  {
   for(int j=1;j<=n;j++)
   {
     if(i==3 || j==3)
     {
       if(i==j)
          System.out.print("@" +"\t");
      else
          System.out.println("*"+"\t");
     else
     {
       System.out.print(" "+"\t");
     }
   }
   System.out.println("\n");
   }
  }
 }