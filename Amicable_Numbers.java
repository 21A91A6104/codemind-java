import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,arr[],i,j,k=0,temp,temp2,s=0;
    n=sc.nextInt();
    m=sc.nextInt();
    arr=new int[100];
    temp=n;
    temp2=m;
    for(i=1;i<=n/2;i++)
    {
        if(n%i==0)
        {
            k=k+i;
        }
    }
    for(i=1;i<=m/2;i++)
    {
        if(m%i==0)
        {
           s=s+i;
        }
    }
    if(s==temp && k==temp2)
    {
        System.out.println("Amicable");
    }
    else
    {
        System.out.println("Not Amicable");
    }
    }
}