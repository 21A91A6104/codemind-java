import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,d,s=0;
    n=sc.nextInt();
    k=n*n;
    while(k!=0)
    {
        d=k%10;
        k=k/10;
        s=s+d;
    }
    if(s==n)
    {
        System.out.println("Neon Number");
    }
    else
    {
        System.out.println("Not Neon Number");
    }
    }
}