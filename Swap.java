class Swap
{
 public static void main(String args[])
 {
  int a=10,b=20,c;
  c=a^b;
  b=b^c;
  a=b^c;
 System.out.println(a);
 System.out.println(b);
}
}