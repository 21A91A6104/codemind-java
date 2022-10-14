import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,m,arr[],k=0,j=0;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    m=sc.nextInt();
    {
        for(i=0;i<n;i++)
        {
            if(arr[i]==m)
            {
                k++;
            }
        }
    }
    System.out.print(k);
    }
}