import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j=0,k[],a[],s,t,u=0,v=0,r=9999,h=0;
        n=sc.nextInt();
        a=new int[n];
        k=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        s=sc.nextInt();
        t=sc.nextInt();
        for(i=0;i<n;i++)
        {
           if(a[i]>=s && a[i]<=t)
             {
                  k[j]=a[i];
                  j+=1;
             }
         }
       if(j==0)
             System.out.println("-1");
      else
       {
             for(i=0;i<j;i++)
               {
                     if(k[i]<=r)
                     {
                         r=k[i];
                      }
              }
          System.out.println(r);
       }
    }
}
