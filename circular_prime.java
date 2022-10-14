import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,temp,d,s=0,k=0;
    n=sc.nextInt();
    temp=n;
    for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
    while(temp!=0)
    {
        d=temp%10;
        temp=temp/10;
        s=s*10+d;
    }
    for(i=1;i<=s;i++)
    {
       if(s%i==0)
       {
           k++;
       }
    }
    if(k==2 && c==2)
    {
        System.out.println("circular prime");
    }
    else if(k!=2 && c==2)
    {
        System.out.println("prime but not a circular prime");
    }
    else
    {
        System.out.println("not prime");
    }
    }
}