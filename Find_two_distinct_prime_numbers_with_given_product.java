import java.util.Scanner;
class calssname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,m,c=0;
    n=sc.nextInt();
    for(i=1;i<n;i++)
    {
        for(j=i;j<n;j++)
        {
            if(i*j==n)
            {
                c+=1;
                System.out.print(i+" "+j);
            }
        }
    }
    if(c==0)
    {
        System.out.print("-1");
    }
    }
}