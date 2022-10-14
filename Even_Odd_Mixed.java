import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d;
    n=sc.nextInt();
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        if(d%2!=0 && n%2!=0)
        {
            System.out.println("Odd");
            break;
        }
        else if(d%2==0 && n%2==0)
        {
            System.out.println("Even");
            break;
        }
        else
        {
            System.out.println("Mixed");
            break;
        }
    }
    }
}