package com.aditya;

/**
 * Count the factors of A
 */
public class CountFactors
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
		return count;
	}
}
