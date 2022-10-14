import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,t,i,j,k=1;
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
        t=sc.nextInt();
        for(j=1;j<=t;j++)
        {
            k=k*j;
        }
        System.out.println(k);
        k=1;
    }
    }
}