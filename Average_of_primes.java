import java.util.Scanner;
class classname
{
    public static boolean isprime(int x)
    {
        int i;
        for(i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,j,k=0;
        float c=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                continue;
            }
            else
            {
            if(isprime(a[i]))
            {
                k=k+a[i];
                c+=1;
            }
            }
        }
        System.out.format("%.2f",(float)k/c);
    }
}