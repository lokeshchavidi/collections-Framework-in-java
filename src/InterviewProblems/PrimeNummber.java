package InterviewProblems;

//import java.util.*;
import java.util.Scanner;

public class PrimeNummber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		boolean isPrime = true;
		if(n <=1 ) {
			isPrime = false;
		}
		else {
			for(int i = 2; i < n; i++) {
				if(n%i ==0) {
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(n +" it is Prime number");
		}
		else {
			System.out.println(n +" Not a prime number");
		}

		sc.close();
	}

}
