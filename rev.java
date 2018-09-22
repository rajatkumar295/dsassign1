import java.util.Scanner;
class revn
{
	void revno(int a[],int x,int y)
	{
         
		int temp;
		if(y>=x)
		{
			temp=a[x];
			a[x]=a[y];
			a[y]=temp;
			x=x+1;
			y=y-1;
			revno(a,x,y);
		}
	
	}
}
class rev
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n,i=0,j;
		n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		i=0;
        j=n-1;
        revn r=new revn();
        r.revno(a,i,j);
        for(i=0;i<=j;i++)
        {
        	System.out.print(a[i]);
        }
	}
}