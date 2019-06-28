package wipro2;

public class Ar2 {
	public static void main(String [] args)
	{
		int[] a= {10,20,50,70,90};
		int i,min=a[0],max=a[0];
		for(i=1;i<a.length;i++)
		{
		  if (min>a[i])
			  min=a[i];
		  if(max<a[i])
			  max=a[i];
		}
		System.out.println("max and min values are:" +max+" " +min);
	}

}
