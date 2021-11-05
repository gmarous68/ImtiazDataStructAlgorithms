package SearchingAlgorithms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type in no. of iterations: ");
		int n = sc.nextInt();
		
		fibonacci(n);
		
		sc.close();
	}
	
	public static void fibonacci(int n) {
		int min = 1, max = 1;
		
		System.out.print(min + " ");
		
		for(int i=0; i<n; i++) {
			System.out.print(max + " ");
			max = min + max;
			min = max - min;			
		}		
	}
}
