package Com;

public class ArrayExample1 {

	//creating a method which is taking array as parameter
	public void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
		
		}
	}
	public static void main(String[] args) {
		ArrayExample1 a = new ArrayExample1(); //object creation for invoking method
		int arr[]= {2,4,5,8,7,3,2,9,6}; //declaring & initializing an array
		a.display(arr);  //passing array to method 

	}

}
