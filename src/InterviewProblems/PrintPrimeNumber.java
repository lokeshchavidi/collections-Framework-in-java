package InterviewProblems;

import java.util.Scanner;

public class PrintPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		
		for(int i = 2; i <= n; i++){
			boolean isPrime = true;
			
			for(int k =2; k * k <= i; k++) {
				if(i % k ==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i+ "");
			}
		}
		
sc.close();
	}
}
