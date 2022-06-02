package Com;
import java.util.Scanner;
public class CheckNumber {
	void checkPalindrome() {
		int rem,sum=0,temp;

		System.out.println("Enter number to chcek palindorme or not :");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		temp=num; //actual value stored in temp variable
		while(num>0) {
			rem=num%10; //remainder
			sum=(sum*10)+rem;
			num /= 10;	
		}
		if(temp==sum)
			System.out.println(temp + " is Palindrome number");
		else
			System.out.println(temp + " is not palindrome number");
	}

	void checkArmstrong() {
		int rem,result=0,temp;

		System.out.println("Enter number to chcek Armstrong or not :");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		temp=num;
		while(temp != 0) {
			rem=temp % 10; //to get remainder
			result +=Math.pow(rem, 3); //power of 3
			temp /= 10;
		}
		if(result == num)
			System.out.println(num + " is Armstrong number");
		else
			System.out.println(num + " is not Armstrong number");	

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckNumber c= new CheckNumber(); // creating object
		c.checkPalindrome(); // calling checkPalindrome method
		c.checkArmstrong(); // calling checkArmstrong method

	}

}
