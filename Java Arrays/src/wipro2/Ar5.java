package wipro2;

import java.util.Arrays;

public class Ar5 {
	public static void main(String []args)
	{
		int a []= {12,5,7,88,26,4};
		Arrays.sort(a);
		System.out.println("smallest numbers are");
		 for(int i=0;i<2;i++)
		 {
			 System.out.println(a[i]);
		 }
		 System.out.println("largest numbers are");
		 for(int i=a.length-1;i>a.length-3;i--)
		 {
			 System.out.println(a[i]);
	}
	}
}
