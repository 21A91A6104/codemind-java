import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,j,res=0,min=9999;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        if(min>arr[i])
        min=arr[i];
    }
    for(i=min;i>=1;i--)
    {
        res=0;
        for(j=0;j<n;j++)
        {
            if(arr[j]%i!=0)
            {
                res=1;
                break;
            }
        }
        if(res==0)
        {
            System.out.println(i);
            break;
        }
    }
    }
}