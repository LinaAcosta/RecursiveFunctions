package model;

public class RecursiveFunctions {
	public static int arraySummatory(int[] a) {
		return arraySummatory(a, a.length-1);
	}
	public static int arraySummatory(int[] a, int n) {
		if(n== 0) {
			return a[0];
		}else {
			return a[n] + arraySummatory(a,n+1);
		}
	}
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return n*factorial(n - 1);
		}
	}
	public static int fibonacci(int n) {
		if(n == 0 ) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci( n-2);
		}
	}
}
