import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int n,arr[],i,k,s=0;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        if(arr[i]%2==0)
        {
            s=0;
            s=s+arr[i];
        }
    }
    System.out.print(s);
    }
}