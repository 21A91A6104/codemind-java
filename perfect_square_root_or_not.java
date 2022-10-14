import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
    float z=0,m;
    n=sc.nextInt();
    z=(float)Math.sqrt(n);
    m=z;
    if((int)m==z)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    }
}