import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,j,c=0,k=0;
    n=sc.nextInt();
    arr=new int[1000];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        c=0;
        for(j=i;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                c++;
            }
        }
        if(c==1)
        {
            if(arr[i]%2==0)
            {
                k+=1;
            }
        }
    }
    System.out.println(k);
    }
}