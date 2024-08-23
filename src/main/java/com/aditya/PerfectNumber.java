package com.aditya;

/**
 * You are given an integer A. You have to tell whether it is a perfect number or not. 
 * Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
 * A proper divisor of a natural number is the divisor that is strictly less than the number.
 */
public class PerfectNumber
{
	public int solve(int A) {
        int sum = 0;
        for (int i = 1; i * i <= A; i++)
        {
            if (A % i == 0)
            {
                if (i == A/i)
                {
                    sum += i;
                }
                else
                {
                    sum += i;
                    sum += (A/i);
                }
            }
        }
        if (sum == A * 2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
