import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c,i,z=0;
        n=sc.nextInt();
        for(i=0;i<n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            if(c==n)
            {
                System.out.print("True");
                z+=1;
                break;
            }
        }
        if(z==0)
        {
            System.out.print("False");
        }
    }
}