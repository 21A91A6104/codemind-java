import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,j,a,b,sum=0,x=0;
    n=sc.nextInt();
    arr=new int[1000];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    a=sc.nextInt();
    b=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(arr[i]>=a && arr[i]<=b)
        {
            x++;
            sum=sum+arr[i];
         }
    }
    if(x==0)
    {
        System.out.println("-1");
    }
    System.out.println(sum);
    }
}