import java.util.*;
class str
{
	int sum=0;
	void sum(String word)
	{
      int s2=Integer.parseInt(word);
      while(s2!=0)
      {
      	sum=sum+s2%10;
      	s2=s2s/10;
      }
      System.out.println(sum);
	}
}
class sumstr
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	 String s1;
     s1=s.next();
     str r=new str();
     r.sum(s1);
	}
}