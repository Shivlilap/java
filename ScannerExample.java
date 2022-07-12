package Com;
import java.util.Scanner;
public class ScannerExample {
static int add(int num1,int num2) {
	int sum =num1+num2;
	return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter first Number");
int n1=sc.nextInt();
System.out.println("Enter second number");
int n2=sc.nextInt();
int result=add(n1,n2);
System.out.println("Addition :" + result);
	}
}


