package com.aditya;

/**
 * Given an array A, find the size of the smallest subarray such that it
 * contains at least one occurrence of the maximum value of the array and at
 * least one occurrence of the minimum value of the array.
 */
public class ClosestMinMax
{
	public int solve(int[] A)
	{
		int min = A[0];
		int max = A[0];
		for (int element : A)
		{
			if (element < min)
			{
				min = element;
			}
			if (element > max)
			{
				max = element;
			}
		}
		int minIndex = -1;
		int maxIndex = -1;
		int subarrayLength = A.length;
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] == min)
			{
				minIndex = i;
				if (maxIndex != -1 && minIndex - maxIndex + 1 < subarrayLength)
				{
					subarrayLength = minIndex - maxIndex + 1;
				}
			}
			if (A[i] == max)
			{
				maxIndex = i;
				if (minIndex != -1 && maxIndex - minIndex + 1 < subarrayLength)
				{
					subarrayLength = maxIndex - minIndex + 1;
				}
			}
		}
		return subarrayLength;
	}
}
