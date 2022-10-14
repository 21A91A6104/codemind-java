import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,d,temp,s=0,c=0,i,p=0;
    n=sc.nextInt();
    temp=n;
    k=n*n;
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        c++;
    }
    for(i=0;i<c;i++)
    {
        d=k%10;
        k=k/10;
        s=s*10+d;
    }
    while(s!=0)
    {
    	d=s%10;
    	s=s/10;
    	p=p*10+d;
	}
	if(p==temp)
	{
		System.out.println("Automorphic Number");
	}
	else
	{
		System.out.println("Not an Automorphic Number");
	}
    }
}