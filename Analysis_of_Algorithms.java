import java.util.*;

// Given a number n, write a function to find the sum of first n natural numbers

public class Analysis_of_Algorithms {
	int i;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		int i, sum = 0;
		
		for(i=0;i<=n;i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum of " + n + " numbers is: " + sum)
	}
}
