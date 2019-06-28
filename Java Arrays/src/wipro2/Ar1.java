package wipro2;

public class Ar1 {
	public static void main(String [] args)
	{
		int a []= {10,20,30,40};
		int sum=0;
		float avg=0;
		 for(int i=0;i<a.length;i++)
		 {
			 sum+=a[i];
		 }
		 System.out.println("sum is" +sum);

 avg=avg+sum/a.length;
 System.out.println("avg  is" +avg/a.length);
}
}
