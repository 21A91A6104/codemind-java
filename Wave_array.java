import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,arr[],j,c=0,k=0;
        n=sc.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=1;i<n-1;i++)
        {
            if((arr[i-1]<arr[i] && arr[i]>arr[i+1])||(arr[i-1]>arr[i] && arr[i]<arr[i+1]))
            {
                c+=1;
            }
            else
            {
                k+=1;
            }
        }
        if(k>0)
        {
            System.out.println("no");
        }
        else
        { 
            System.out.println("yes");   
        }
    }
}