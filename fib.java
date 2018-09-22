import java.util.Scanner;
class fibo
{
	int f=0,s=1,fib=1;
	int fi(int x)
	{

      if(x>1)
      {
      	fib=s+f;
      	f=s;
      	s=fib;
      	x--;
      	fi(x);
      }
      if(x==0)
      {
      	fib=0;
        return fib;
      }
      return fib;
	}
}
class fib
{
	public static void main(String[] main)
	{
	Scanner s=new Scanner(System.in);
	int n;
	 n=s.nextInt();
	 fibo b=new fibo();
	 int y=b.fi(n);
	 System.out.println(y);
	}
}