import java.util.Scanner;
class classname
{
    public static boolean prime(int i)
    {
    int j;
    for(j=2;j<i;j++)
    {
        if(i%j==0)
        {
            return false;
        }
    }
    return true;
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,m,c=0,d=0,j;
    n=sc.nextInt();
    if (prime(n)==true)
    {
        System.out.println("0");
    }
    else
    {
    for(i=n;i>1;i--)
    {
        if(prime(i)==true)
        {
            c=i;
            break;
        }
    }
    for(i=n;i<n+1000;i++)
    {
        if(prime(i)==true)
        {
            d=i;
            break;
        }
    }
    if((n-c)>(d-n))
    {
        System.out.println(d-n);
    }
    else
    {
        System.out.println(n-c);
    }
    }
    }
}