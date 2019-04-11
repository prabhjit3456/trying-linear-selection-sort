
package test;

public class test2
{
	public static long fib(long n) 
	{
		if (n==0) 
		{
			return 1;
		}
	else if(n ==1)
		{
			return 1;
		}
		 else 
		 {
			 return fib(n-1)+fib(n-2);
		 }
		
	}
	public static long Fastest62Fib(int n) {
		long fibNMinusOne = 1, fibNMinusTwo  = 1, fib = 0;
		if (n == 1 || n == 2) return 1;
		for (int i = 3; i <= n; i++) {
			fib = fibNMinusOne + fibNMinusTwo;
			fibNMinusTwo = fibNMinusOne;			
			fibNMinusOne = fib;
		}
		return fib;
	}
	public static long ActualDynamicFib(int n) {
		long[] fibNumbers = new long[n + 2];
		fibNumbers[1] = 1;
		fibNumbers[2] = 1;
		for (int i = 3; i <= n; i++)
			fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
		return fibNumbers[n];
	}
	
	public static void main(String[] args) 
	{
		int j = 4000;
		System.out.println(FastestFib(j));
		for (int i = 1; i < 100; i++)
			System.out.println(i + " : " + FastestFib(i) + " : " + ActualDynamicFib(i));
		//System.out.println(fib(j));
	}

}
