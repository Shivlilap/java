package Com;

public class ObjectExample {
	//defining fields
		int id;
		String name;
		String dept = "IT";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectExample obj = new ObjectExample(); //cewating an object or instant
		ObjectExample obj1 = new ObjectExample();

		obj.id = 100; //initializing object
		obj.name= "mamta";

		obj1.id = 101;
		obj1.name = "ram";

		System.out.println(obj.id + " " + obj.name + " " + obj.dept); //printing values of object
		System.out.println(obj1.id + " " + obj1.name + " " + obj.dept );
		}
		


	}


