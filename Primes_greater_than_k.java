import java.util.*;
class javalabprog
{
    public static boolean isprime(int k)
{
    int j;
    if(k<2)
    {
        return false;
    }
    for(j=2;j<=(int)Math.sqrt(k);j++)
    {
        if(k%j==0)
        {
            return false;
        }
    }
    return true;
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,d,k=0,temp,a[],c=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        d=sc.nextInt();
       for(i=0;i<n;i++)
       {
           if(isprime(a[i]))
           {
               if(a[i]>=d)
               {
                   c+=1;
               }
           }
       }
       System.out.print(c);
    }
}