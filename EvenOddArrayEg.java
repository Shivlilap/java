package Lab;

public class EvenOddArrayEg {

	public static void main(String[] args) {
		// initialize array
		int [] arr = new int []{1,7,4,8,2,3,9};
		   
	     System.out.println("------Even Arrray--------");
	     //i=1 first even present at position 1
	     for(int i=1; i<arr.length;i=i+2) {
	    	 System.out.print(arr[i]+ " ");

	}
    System.out.println();
	     System.out.println("------Odd Arrray--------");
	     
	     for(int i=0; i<arr.length;i=i+2) {
	    	 System.out.print(arr[i]+ " ");
       }
       System.out.println();
       //calculate even number in array
	   System.out.println("Even Number");
	
	     for (int i=0; i<arr.length;i++) {
	    	 if (arr[i]%2==0)
	    		 System.out.print(arr[i]+ " ");
	     }
	     System.out.println();
	   //calculate odd number in array
		   System.out.println("Odd Number");
		   
		      for (int i=0; i<arr.length;i++) {
		    	 if (arr[i]%2!=0)
		    		 System.out.print(arr[i]+ " ");
		     }
	}
	
}