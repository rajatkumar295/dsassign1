import java.util.Scanner;
class avail
{
	int i=0;
	int value(int a[],int x,int y)
	{
		
	  if(i<y)
	  {
		if(a[i]==x)
		{
			return 1;
		}
		else
		{
			i=i+1;
			value(a,x,y);
		}
	  }
	  return 0;
	}
}
class availability
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
      int n,m,i;
      n=s.nextInt();
      int[] a=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      m=s.nextInt();
      avail v=new avail();
      v.value(a,m,n);
      if(v.value(a,m,n)==1)
      {
      	System.out.println("Found");
      }
      else
      {
      	System.out.println("Not found");
      }

	}
}