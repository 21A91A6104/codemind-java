import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,k,l;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    k=(int)Math.pow(a,b);
    l=k%c;
    System.out.println(l);
    }
}