package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    int result = 1 + 2; // 1 + 2 = 3
	    System.out.println(result);
		int previousResult = result;
		System.out.println(previousResult);
		result = result - 1; // 3 - 1 = 2
        System.out.println(" 3 - 1 =" + result);

        result = result * 10; // 2 * 10 = 20
	    System.out.println(result);

	    result = result / 5; // 20 / 5 = 4
	    System.out.println(result);

	    result = result % 3;    // remainder of (4 % 3) = 1
	    System.out.println(result);

    }
}
