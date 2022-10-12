import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,c=0;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=1;i<n;i++)
    {
        if(arr[i]%2!=0)
        {
            if(arr[i-1]%2==0 && arr[i+1]%2==0)
            {
                if(i!=n-1)
                {
                    c++;
                }
            }
        }
        
    }
    System.out.println(c);
    }
}