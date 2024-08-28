package com.aditya;

/**
 * Given an array A of size N, find the subarray of size B with the least
 * average.
 */
public class SubarrayWithLeastAvg
{
	public int solve(int[] A, int B)
	{
		int length = A.length;
		int currentSum = 0;
		int answer = 0;
		for (int i = 0; i < B; i++)
		{
			currentSum += A[i];
		}
		int lowestSum = currentSum;
		int indexToRemove = 0;
		for (int i = B; i < length && B <= length; i++)
		{
			currentSum = currentSum + A[i] - A[indexToRemove++];
			if (currentSum < lowestSum)
			{
				lowestSum = currentSum;
				answer = indexToRemove;
			}
		}
		return answer;
	}
}
