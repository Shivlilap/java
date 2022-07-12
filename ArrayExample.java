package Com;

public class ArrayExample {

	public static void main(String[] args) {
		// datatype arrayname = new datatype[size]
      int arr[] = new int[10]; //declaration & instantiation
      
      arr[0] = 100; //initialization
      arr[1] = 200;
      arr[2] = 170;
      arr[3] = 180;
      arr[4] = 150;
      arr[5] = 180;
      arr[6] = 120;
      arr[7] = 145;
      arr[8] = 768;
      arr[9] = 160;
      
      //traversing array
      for (int i=0;i<arr.length;i++) { //length is property of array
         System.out.println("Array value are : "  + arr[i] + " ");
      }
      System.out.println();
      System.out.println("value at 6th position : " + arr[6]); //specify element on index
      System.out.println(arr.length);
      
      String ar[] = {"aa","qqq","www","rrr","uuuu","bbbb"}; //declaration, instantiation, initialization
      
      //traversing array 
 //      for (int i=0;i<ar.length;i++) {//length is property of array 
 //   	   System.out.println( ar[i] + " ");
    	   
  //     }
	
	//printing using for-each loop
	for(String my : ar) {
		System.out.print(my + " ");
	}
	
	
     }
	
    }
      



