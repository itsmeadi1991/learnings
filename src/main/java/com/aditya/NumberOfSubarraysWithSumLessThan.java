package com.aditya;

/**
 * Given an array A of N non-negative numbers and a non-negative number B, you
 * need to find the number of subarrays in A with a sum less than B. We may
 * assume that there is no overflow.
 */
public class NumberOfSubarraysWithSumLessThan
{
	public int solve(int[] A, int B)
	{
		int length = A.length;
		int answer = 0;
		int[] pSum = new int[length];
		pSum[0] = A[0];
		for (int i = 1; i < length; i++)
		{
			pSum[i] = A[i] + pSum[i - 1];
		}
		for (int i = 0; i < length; i++)
		{
			for (int j = i; j < length; j++)
			{
				if (i == 0)
				{
					if (pSum[j] < B)
					{
						answer++;
					}
				}
				else if (pSum[j] - pSum[i - 1] < B)
				{
					answer++;
				}
			}
		}
		return answer;
	}
}
