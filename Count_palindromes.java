import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a[],b,k=0,c=0,temp,d;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            k=0;
            temp=a[i];
            while(temp!=0)
            {
                d=temp%10;
                temp=temp/10;
                k=k*10+d;
            }
            if(k==a[i])
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}