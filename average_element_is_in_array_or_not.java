import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],avg,k=0,i,j=0;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        k=k+arr[i];
    }
    avg=k/n;
    for(i=0;i<n;i++)
    {
        if(arr[i]==avg)
        {
            j++;
        }
    }
    if(j==0)
    {
        System.out.print("False");
    }
    else
    {
        System.out.print("True");
    }
    }
}