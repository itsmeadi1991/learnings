package com.aditya;

/**
 * Given an array A of length N. Also given are integers B and C. Return 1 if
 * there exists a subarray with length B having sum C and 0 otherwise
 */
public class SubarrayWithGivenLengthAndSum
{
	public int solve(int[] A, int B, int C)
	{
		int length = A.length;
		int currentSum = 0;
		for (int i = 0; i < B && B <= length; i++)
		{
			currentSum += A[i];
		}
		if (currentSum == C)
		{
			return 1;
		}
		int indexToRemove = 0;
		for (int i = B; i < length && B <= length; i++)
		{
			currentSum = currentSum - A[indexToRemove++] + A[i];
			if (currentSum == C)
			{
				return 1;
			}
		}
		return 0;
	}
}
