import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m=0,i,temp,d;
    n=sc.nextInt();
    temp=n;
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        if(d==0)
        {
            continue;
        }
        m=m*10+d;
    }
    System.out.println(m);
    }
}