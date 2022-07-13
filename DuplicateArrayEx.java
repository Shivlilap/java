package Lab;

public class DuplicateArrayEx {
	//method to find duplicate in array
	public static void calculateDuplicate() {
	
		//initialize array
		int [] arr = new int [] {1,7,4,9,3,8,2,3,9};
		
		System.out.println("Duplicate value"); 
		
	for(int i=0; i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			 if(arr[i] == arr[j]) 
				 
				 System.out.println(arr[i]);
		}
	}
		 
	}
	
	public static void main(String[] args) {
	
		calculateDuplicate(); //invoke method
		

	}

}
