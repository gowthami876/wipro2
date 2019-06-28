package wipro2;

public class Ar3 {
	public static void main(String [] args)
	{
		int a []= {10,20,40,60,80};
		int i,count=0;
		int search=Integer.parseInt(args[0]);
		for(i=0;i<a.length;i++)
		{
			if (a[i]==search)
			{
				count++;
				System.out.println("position is:"  +i);
			}
		}
		if(count==0)
			System.out.println("-1");
	}

}
