import java.util.Scanner;
class patteren
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k=64;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}