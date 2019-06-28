package wipro2;

public class Ar8 {
	public static void main(String [] args)
	{
		int a [] = {1,4,67,34,9,56,9};
		boolean t=true;
		int i,s=0;
		 for(i=0;i<a.length;i++)
		 {
			 if(a[i]!=6 && t==true)
				 s=s+a[i];
			 else if(a[i]==6)
				 t=false;
			 else if(a[i]==7)
				 t=true;		 
		 }
		 System.out.println(+s);
	}

}
