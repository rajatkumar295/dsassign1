import java.util.Scanner;
class multi
{
	int a=1,co=0,i=0,cs=0,cc=0;
	public int fun(String x)
	{
		
	
		int l=x.length();
		if(i==l)
		{
		if(cs==0 && cc==0 && co==0)
		{
		a=0;
        return a;
	    
		}
		else
		{
	    return a;
		}
		}
		else
		{
		if(x.charAt(i)=='(')
		{
			co++;
		}
		else if(x.charAt(i)==')')
		{
			co--;
		}
		else if(x.charAt(i)=='[')
		{
			cs++;
		}
		else if(x.charAt(i)==']')
		{
			cs--;
		}
		else if(x.charAt(i)=='{')
		{
			cc++;
		}
		else if(x.charAt(i)=='}')
		{
			cc--;
		}
		i++;
		fun(x);
	    }
		
        return a;
    }
	public static void main(String[] args)
	{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter 1st no");
    
    String x=s.next();
    multi q=new multi();
    int b=q.fun(x);
    if(b==0)
    {
    	System.out.println("Stable");
    }
    else

    {
    	System.out.println("UnStable");
    }
    }

}