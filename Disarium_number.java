import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,c=0,temp,s=0;
    n=sc.nextInt();
    temp=n;
    while(temp!=0)
    {
        d=temp%10;
        temp=temp/10;
        c++;
    }
    temp=n;
    while(temp!=0)
    {
        d=temp%10;
        temp=temp/10;
        s=s+(int)Math.pow(d,c);
        c--;
    }
    if(n==s)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    }
}