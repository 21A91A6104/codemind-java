import java.util.Scanner;
class patteren
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=(n+1)-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}