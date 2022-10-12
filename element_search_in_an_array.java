import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,j,flag=0;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    j=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(arr[i]==j)
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
    {
        System.out.print("True");
    }
    else
    {
        System.out.print("False");
    }
    }
}