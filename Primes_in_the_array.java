import java.util.Scanner;
class classname
{
    public static boolean isprime(int n)
    {
        int i;
        for(i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,a[],i,j,c=0;
        x=sc.nextInt();
        a=new int[x];
        for(i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<x;i++)
        {
            if(a[i]==1)
            {
                continue;
            }
            else
            {
            if(isprime(a[i]))
            {
                c+=1;
            }
            }
        }
        System.out.println(c);
    }
}