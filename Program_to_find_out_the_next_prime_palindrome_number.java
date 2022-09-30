import java.util.Scanner;
class javalabprog
{
    public static boolean isprime(int i)
{
    int j;
    if(i<2)
    {
        return false;
    }
    for(j=2;j<=(int)Math.sqrt(i);j++)
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
        int n,i,j,d,k=0,temp;
        n=sc.nextInt();
        for(i=n+1;i<i+10000;i++)
        {
            k=0;
            temp=i;
            if(isprime(i))
            {
                while(temp>0)
                {
                    d=temp%10;
                    temp=temp/10;
                    k=k*10+d;
                }
                if(k==i)
                {
                    System.out.println(k);
                    break;
                }
              else
               {
                  k=0;
                }
            }
            else
            {
              continue;
              
            }
        }
    }
}