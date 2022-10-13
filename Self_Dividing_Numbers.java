import java.util.Scanner;
class classname
{
    public static boolean fun(int n)
    {
        int d,temp,c=0,cc=0;
	temp=n;//10
	while(n!=0)
	{
		d=n%10;//0
		if(d==0)
		{
			return false;
		}
		if(temp%d==0)
		{
			cc++;
		}
		c++;
		n=n/10;
	}
	if(c==cc)
	{
		return true;
	}
	else
	{
		return false;
	}
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,i;
        n1=sc.nextInt();
        n2=sc.nextInt();
    for(i=n1;i<=n2;i++)//10
    {
        if(fun(i))//10
        {
            System.out.print(i+" ");
        }
    }
    }
}