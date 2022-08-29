import java.util.*;
class W2Q1
{
    public static void main(String[] args)
     {  

                int c, n, search, arr[],temp=0;  
   
                Scanner in = new Scanner(System.in);  
                System.out.println("Enter number of elements");  
                n = in.nextInt();   
                arr = new int[n];  
   
                System.out.println("Enter those " + n + " elements");  
   
                for (c = 0; c < n; c++)  
                    arr[c] = in.nextInt();
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < n; i++){  
                        System.out.print(arr[i] + " ");  
                }

                System.out.println();  

                  
                for(int i=0; i < n; i++)
        		 {  
             	    for(int j=1; j < (n-i); j++)
                	 {  
                          if(arr[j-1] > arr[j])
                        	  {  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                        	 }  
                          
                	 }  
       		     } 

       		    System.out.println("Array in ascending order : ");  
                for(int i=0; i < n; i++)
                {  
                        System.out.print(arr[i] + " "); 
                }  

                System.out.println();  

                  
                for(int i=0; i < n; i++)
        		 {  
             	    for(int j=1; j < (n-i); j++)
                	 {  
                          if(arr[j-1] < arr[j])
                        	  {  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                        	 }  
                          
                	 }  
       		     } 

       		    System.out.println("Array in descending order : ");  
                for(int i=0; i < n; i++)
                {  
                        System.out.print(arr[i] + " "); 
                }
    }
}
                  
             