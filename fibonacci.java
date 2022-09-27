import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c,i;
        System.out.print(a+" ");
        System.out.print(b+" ");
        n=sc.nextInt();
        for(i=0;i<n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}