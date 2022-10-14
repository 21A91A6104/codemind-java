import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int res=0,n,d,k=1,sum=0;
    n=sc.nextInt();
    while(n!=0)
    {
    d=n%10;
    n=n/10;
    k=k*d;
    sum=sum+d;
    }
    res=k-sum;
    System.out.println(res);
    }
}