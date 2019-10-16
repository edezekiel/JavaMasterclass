package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    int result = 1 + 2; // 1 + 2 = 3
		int previousResult = result;
		result = result - 1; // 3 - 1 = 2
        result = result * 10; // 2 * 10 = 20
	    result = result / 5; // 20 / 5 = 4
	    result = result % 3;    // remainder of (4 % 3) = 1
	    result++;
	    result--;
		result+=2;
		result*=10;
		result/=3;
		result-=2;

	    System.out.println(result);

    }
}
