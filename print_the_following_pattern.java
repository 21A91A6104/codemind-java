import java.util.Scanner;
class patteren
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k=64;
        n=sc.nextInt();
        for(i=n;i>0;i--)
        {
            for(j=i;j>0;j--)
            {
                System.out.print((char)(k+i)+" ");
            }
            System.out.println();
        }
    }
}