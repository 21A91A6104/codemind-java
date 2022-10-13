import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,k,w;
    float s;
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        s=(float)Math.sqrt(arr[i]);
        w=(int)s;
        if(w==s)
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