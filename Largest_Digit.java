import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,k=0;
    n=sc.nextInt();
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        if(k<d)
        {
            k=d;
        }
        
    }
    System.out.println(k);
    }
}