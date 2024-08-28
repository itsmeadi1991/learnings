package com.aditya;

/**
 * Given an array of integers A, a subarray of an array is said to be good if it
 * fulfills any one of the criteria:
 * 
 * 1. Length of the subarray is be even, and the sum of all the elements of the
 * subarray must be less than B.
 * 
 * 2. Length of the subarray is be odd, and the sum of all the elements of the
 * subarray must be greater than B.
 * 
 * Your task is to find the count of good subarrays in A.
 */
public class GoodSubarrays
{
	public int solve(int[] A, int B)
	{
		int answer = 0;
		int length = A.length;
		int[] pSum = new int[length];
		pSum[0] = A[0];
		for (int i = 1; i < length; i++)
		{
			pSum[i] = pSum[i - 1] + A[i];
		}
		for (int i = 0; i < length; i++)
		{
			for (int j = i; j < length; j++)
			{
				if (i == 0)
				{
					if (((j - i + 1) % 2 == 0 && pSum[j] < B) || ((j - i + 1) % 2 == 1 && pSum[j] > B))
					{
						answer++;
					}
				}
				else
				{
					if (((j - i + 1) % 2 == 0 && pSum[j] - pSum[i - 1] < B)
							|| ((j - i + 1) % 2 == 1 && pSum[j] - pSum[i - 1] > B))
					{
						answer++;
					}
				}
			}
		}
		return answer;
	}
}
