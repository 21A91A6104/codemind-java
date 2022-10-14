import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=0,d=0,r,i,n,m,c=0,j;
    n=sc.nextInt();
    for(r=0;r<n;r++)
    {
        m=sc.nextInt();
        for(i=m;i>2;i--)
        {
            c=0;
            for(j=2;j<i;j++)
            {
            if(i%j==0)
            {
                c=1;
                break;
            }
            }
            if(c==0)
            {
                t=i;
                break;
            }
        }
        for(i=m;i<m+100;i++)
        {
            c=0;
            for(j=2;j<i;j++)
            {
            if(i%j==0)
            {
                c=1;
                break;
            }
            }
            if(c==0)
            {
                d=i;
                break;
            }
        }
        if((m-t)<=(d-m))
        {
            System.out.println(t);
        }
        else
        {
            System.out.println(d);
        }
    }
    }
}