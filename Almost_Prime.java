import java.util.Scanner;
class classname
{
    public static boolean isprime(int n)
    {
        int i;
        
        for(i=2;i<n;i++)
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
        int n,i,j,k,p,c=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            k=sc.nextInt();
            c=0;
            for(j=1;j<k/2+1;j++)
            {
                for(p=j+1;p<k/2+1;p++)
                {
                    if(isprime(j)==true && isprime(p)==true)
                    {
                        if(j*p==k)
                        {
                            c=1;
                        System.out.println("YES");
                        }
                    }
                }
            }
            if(c==0)
                {
                    System.out.println("NO");
                }
        }
    }
}