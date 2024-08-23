package com.aditya;

/**
 * You are given an integer array A. You have to find the second largest
 * element/value in the array or report that no such element exists.
 */
public class SecondLargestElementInArray
{
	public int solve(int[] A)
	{
		int max = A[0];
		for (int i = 1; i < A.length; i++)
		{
			if (A[i] > max)
			{
				max = A[i];
			}
		}

		int secondMax = -1;
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] != max && A[i] > secondMax)
			{
				secondMax = A[i];
			}
		}
		return secondMax;
	}
}
