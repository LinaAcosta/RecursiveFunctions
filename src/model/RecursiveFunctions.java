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
	public static int factorial(int[]a) {
		return factorial(a, a.length-1);
	}
	public static int factorial(int[]a, int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return n*factorial(a, n - 1);
		}
	}
	public static int fibonacci(int[]a) {
		return fibonacci(a, a.length-1);
	}
	public static int fibonacci(int[] a, int n) {
		if(n == 0 ) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			return fibonacci(a,n-1) + fibonacci(a, n-2);
		}
	}
}
