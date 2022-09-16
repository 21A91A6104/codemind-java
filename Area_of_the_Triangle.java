import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        Double s,A;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(double)(a+b+c)/2;
        A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",A);
    }
}
