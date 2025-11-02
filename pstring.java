import java.util.Scanner;
class pstring
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a String");
   String st=sc.next();
   String rev="";
   for(int i=st.length()-1;i>=0;i--)
   {
    rev+=st.charAt(i);
   }
 if (st.equals(rev))
  System.out.println("Given String is plandrome");
else
  System.out.println("Given String not plandrome");
}
}
