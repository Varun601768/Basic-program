class tr3
{
 public static void main(String args[])
 {
  int n=5,star=1,space=n-1;
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
   System.out.println("\n");
   star=star+2;
   space--;
}
}
}