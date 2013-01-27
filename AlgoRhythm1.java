import java.lang.Runtime;

public class AlgoRhythm1 
{


	public static void main(String[] args)
	{
		//Runtime runtime = new Runtime(); 
		int base = 2; // = a
		int power  = Integer.MAX_VALUE; // 2^31-1= k
		int division = 5;//=m
		int result1;
		//int runtime1;
		result1 = powmod(base, power, division);
		//runtime1 = ;
		System.out.printf("longer way =",result1);

	}//main
	/*
	 * poemod method that find the reminder of (a^k)/m. 
	 * condition is a,k,and m are bigger than 1, are integer values and every value in java int-values 
	 * (the biggest will be 2.1billion = 21oku  )
	*/
	
	
	static int powmod(int a, int k, int m)
	{
		long t = 1; //3^100 > 2147483647(= 2^31 -1)that is why define with long-integer type.
		for(int i = 0; i < k; ++i)
		{
			t = (t * a) % m;
		}
		return (int)  t;
	}//powmod
	
	
	
	
	
	
}//class 
