package com.aditya;

/**
 * You are given an integer array A of size N. You have to perform B operations.
 * In one operation, you can remove either the leftmost or the rightmost element
 * of the array A. Find and return the maximum possible sum of the B elements
 * that were removed after the B operations.
 */
public class PickFromBothSides
{
	public int solve(int[] A, int B)
	{
		int lengthOfArray = A.length;
		int[] prefixSum = new int[lengthOfArray];
		int[] suffixSum = new int[lengthOfArray];

		prefixSum[0] = A[0];
		for (int i = 1; i < lengthOfArray; i++)
		{
			prefixSum[i] = A[i] + prefixSum[i - 1];
		}
		suffixSum[lengthOfArray - 1] = A[lengthOfArray - 1];
		for (int i = lengthOfArray - 2; i >= 0; i--)
		{
			suffixSum[i] = A[i] + suffixSum[i + 1];
		}
		int sum = prefixSum[B - 1];
		if (suffixSum[lengthOfArray - B] > sum)
		{
			sum = suffixSum[lengthOfArray - B];
		}
		for (int i = 1; i < B; i++)
		{
			if (prefixSum[i - 1] + suffixSum[lengthOfArray - B + i] > sum)
			{
				sum = prefixSum[i - 1] + suffixSum[lengthOfArray - B + i];
			}
		}
		return sum;
	}
}
