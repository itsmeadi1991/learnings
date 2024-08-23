package com.aditya;

/**
 * Given an array A of N integers. Construct prefix sum of the array in the
 * given array itself.
 */
public class InPlacePrefixSum
{
	public int[] solve(int[] A)
	{
		int numberOfElements = A.length;
		for (int i = 1; i < numberOfElements; i++)
		{
			A[i] = A[i - 1] + A[i];
		}
		return A;
	}
}
