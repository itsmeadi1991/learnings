package com.aditya;

/**
 * Check if number A is prime
 */
public class PrimeNumber
{
	public int solve(int A)
	{
		int count = 0;
		for (int i = 1; i * i <= A; i++)
		{
			if (A % i == 0)
			{
				if (A / i == i)
				{
					count += 1;
				}
				else
				{
					count += 2;
				}
			}
		}
		if (count == 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
