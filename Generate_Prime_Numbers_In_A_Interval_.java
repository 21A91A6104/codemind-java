import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,j,c=0,k=0;
    a=sc.nextInt();
    b=sc.nextInt();
    for(i=a;i<=b;i++)
    {
        c=0;
        for(j=1;j<=b;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println(i);
        }
    }
    }
}