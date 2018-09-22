import java.util.Scanner;
class power
{
	int i=1;
	void find(int x,int y)
	{
      if(y!=0)
      {
        i=i*x;
        y--;
        find(x,y);
      }
      else
      {
      System.out.println(i);
  }
	}
}
class pow
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int n,m;
	n=s.nextInt();
	m=s.nextInt();
	power p=new power();
	p.find(n,m);
	}
}