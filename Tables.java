import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            int r1,r2,i;
    r1=sc.nextInt();
    r2=sc.nextInt();
    for(i=1;i<=r2;i++)
    {
        if(i%2==0)
        {
            continue;
        }
        System.out.println(r1+" "+"x"+" "+i+" "+"="+" "+r1*i);
    }

    }
}