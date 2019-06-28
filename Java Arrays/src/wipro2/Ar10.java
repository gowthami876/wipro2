package wipro2;

public class Ar10 {
     public static void main(String [] args)
     {
    	 int a=args.length;
    	 int i,j,max=0;
    	 int arr[][]=new int [3][3];
    	 if(a<9)
    		 System.out.println("enter 9 num in array");
    	 if(a==9)
    	 {
    		 int k=0;
    		 for(i=0;i<3;i++)
    		 {
    			 for(j=0;j<3;j++)
    			 {
    				 arr[i][j]=Integer.parseInt(args[k]);
    				 k++;
    			 }
    	 }
    		 for(i=0;i<3;i++)
    		 {
    			 for(j=0;j<3;j++)
    			 {
    				 if(max<arr[i][j])
    					 max=arr[i][j];
    			 } 		 
             }
    		 System.out.println("max element is:" +max);
    }
     }
     }
    	 
    	 
    	 
    	 
