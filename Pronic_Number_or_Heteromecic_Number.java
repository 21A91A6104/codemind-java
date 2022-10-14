import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0;
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
      if(i*(i+1)==n)
      {
          c++;
      }
    }
    if(c==1)
    {
        System.out.println("YES");
    }
    else
    {
        System.out.println("NO");
    }
    }
}