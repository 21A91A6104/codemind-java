import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,j;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(n%2==0)
            {
                System.out.print(arr[i]+" ");
                break;
            }
            else
            {
                System.out.print(arr[i]+" ");
                break;
            }
        }
    }
    if(n%2==1)
    {
        System.out.println("0");
    }
    }
}