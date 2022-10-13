import java.util.Scanner;
class classname
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,k[],a[],j,c=0,h;
n=sc.nextInt();
a=new int[n];
k=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
k[i]=a[i];
}
for(i=0;i<n;i++)
{
   for(j=i+1;j<n;j++)
    {
        if(a[i]==a[j])
        {
              a[j]=-1;
        }
    }
}
for(i=0;i<n;i++)
{
if(a[i]>=0)
{
c=0;
for(j=0;j<n;j++)
{
  if(a[i]==k[j])
{
 c+=1;
}
}
System.out.print(a[i]+" "+c+" ");
}
}
}
}