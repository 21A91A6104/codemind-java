import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x,i,j,k=0,d,h=0,z=0,y=0,temp;
        n=sc.nextInt();
        x=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            d=temp%10;
            temp=temp/10;
            z=z*10+d;
        }
        temp=n;
        for(i=0;i<x;i++)
        {
            d=z%10;
            z=z/10;
            y=y*10+d;
        }
        temp=n;
        for(i=0;i<x;i++)
        {
            d=temp%10;
            temp=temp/10;
            k=k*10+d;
        }
        while(k!=0)
        {
            d=k%10;
            k=k/10;
            h=h*10+d;
        }
        System.out.println(Math.abs(h-y));
    }
}