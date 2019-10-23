package com.company;

public class Main {

    public static void main(String[] args) {

    	for (double i=8; i >=2; i--) {
		    System.out.println("10,000 at " + i + "% interest = " +
				                       String.format("%.2f", calculateInterest(10000.00, i)));
	    }

    	rangeIsPrime(10);
    }

    public static double calculateInterest(double amount, double interesteRate) {
    	return (amount * (interesteRate/100));
    }

    public static boolean isPrime(int n) {
    	// 1 is not a prime number.
    	if (n <= 1) {
    		return false;
	    }

    	// i <= n/2 optimizes the function. If we can't find any factors less
	    // than or equal to sqrt(n), n must be prime. I.e., if a number n is not
	    // prime, it can be factored into two factors a and b.
	    // a * b cannot be greater than n.
    	for (int i=2; i <= n/2; i++) {
    		// This would be true when a number evenly divides into n.
		    // In that case, n would not be prime.
    		if (n % i == 0) {
    			return false;
		    }
	    }
    	return true;
    }

    public static void rangeIsPrime(int number) {
    	int numOfPrimes = 0;
    	for (int i = 0; i < number; i++) {
    		if (isPrime(i)) {
			    numOfPrimes += 1;
			    System.out.println("Prime found: " + i);
			    if (numOfPrimes == 3) {
			    	break;
			    }
		    }
	    }
    }
}
