package wipro2;

import java.util.Arrays;

public class Ar7 {
	public static void main(String [] args) {
		int a []= {12,24,35,55,12,24,67};
		int temp[]=new int[7];
		int j=0;
		Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        {
        	if(a[i]!=a[i+1])
        	{
        		temp[j++]=a[i];
        	}
        }
        temp[j++]=a[a.length-1];
        for(int i=0;i<j;i++)
        {
        	a[i]=temp[i];
        }
        for(int i=0;i<j;i++)
        {
        	System.out.println(a[i]);
        }
	}

}
