import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,j,l=0,h,sum=0,m,z,k;
    n=sc.nextInt();
    arr=new int[100];
    h=n-1;
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    k=sc.nextInt();
    m=(l+h-1)/2;
    for(i=0;i<n;i++)
    {
         sum=sum+arr[i];
        if(arr[i]==k)
        {
            break;
        }
    }
    System.out.println(sum);
    }
}