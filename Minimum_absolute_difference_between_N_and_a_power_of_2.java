import java.util.Scanner;
class msum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,min=0,max=0,p;
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n>=(int)Math.pow(2,i))
            {
                min=i;
            }
            if(n<(int)Math.pow(2,i))
            {
                max=i;
                break;
            }
        }
        if(n-(int)Math.pow(2,min)<=((int)Math.pow(2,max)-n))
        {
            p=n-(int)Math.pow(2,min);
            System.out.println(p);
        }
        else
        {
            p=(int)Math.pow(2,max)-n;
            System.out.println(p);
        }
    }
}