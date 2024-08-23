package com.aditya;

/**
 * Count prime numbers less than A 
 */
public class CountPrimes
{
	public int solve(int A)
    {
        int sum = 0;
        for (int i = 1; i <= A; i++)
        {
            if (countOfFactors(i) == 2)
            {
                sum += 1;
            }
        }
        return sum;
    }

    public int countOfFactors(int n)
    {
        int count = 0;
        for (int i = 1; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                if (n/i == i)
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
