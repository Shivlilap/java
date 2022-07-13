package Lab;

public class ReverseArrayEg {

	public static void main(String[] args) {
		
		//initialize array
   int [] arr = new int []{1,7,4,9,3,8,2,3,9};
   
     System.out.println("------ Arrray--------");
     //loop for printing array 
     for(int i=0; i<arr.length;i++) {
    	 System.out.print(arr[i]+ " ");
     }
     System.out.println();
    
     System.out.println("------ Reverse Arrray--------");
     
     //loop for printing in reverse order 
     for(int  i=arr.length-1;i>=0;i--) {
    	 System.out.print(arr[i]+ " ");
     }
     	
	
	}

}
