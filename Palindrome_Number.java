import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,d,k=0,temp;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        temp=arr[i];
        k=0;
        while(arr[i]!=0)
        {
            d=arr[i]%10;
            arr[i]=arr[i]/10;
            k=k*10+d;
        }
        if(k==temp)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    }
}