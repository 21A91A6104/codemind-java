import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,k,max,s=0;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    max=arr[0];
    k=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
    for(i=0;i<n;i++)
    {
        s=0;
        s+=arr[i]+k;
        if(s>=max)
        {
            System.out.print("True ");
        }
        else
        {
            System.out.print("False ");
        }
    }
    }
}