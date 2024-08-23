package com.aditya;

/**
 * Given an array, arr[] of size N, the task is to find the count of array
 * indices such that removing an element from these indices makes the sum of
 * even-indexed and odd-indexed array elements equal.
 */
public class SpecialIndex
{
	public int solve(int[] A)
	{
		int countOfSpecialIndexes = 0;
		int numberOfElements = A.length;
		int[] prefixSumOdd = new int[numberOfElements];
		int[] prefixSumEven = new int[numberOfElements];

		prefixSumEven[0] = A[0];
		for (int i = 1; i < numberOfElements; i++)
		{
			if (i % 2 == 0)
			{
				prefixSumEven[i] = prefixSumEven[i - 1] + A[i];
			}
			else
			{
				prefixSumEven[i] = prefixSumEven[i - 1];
			}
		}

		prefixSumOdd[0] = 0;
		for (int i = 1; i < numberOfElements; i++)
		{
			if (i % 2 == 1)
			{
				prefixSumOdd[i] = prefixSumOdd[i - 1] + A[i];
			}
			else
			{
				prefixSumOdd[i] = prefixSumOdd[i - 1];
			}
		}

		for (int i = 0; i < numberOfElements; i++)
		{
			if (i == 0 && prefixSumOdd[numberOfElements - 1] - prefixSumOdd[i] == prefixSumEven[numberOfElements - 1]
					- prefixSumEven[i])
			{
				countOfSpecialIndexes++;
			}
			else if (i != 0 && prefixSumEven[i - 1] + prefixSumOdd[numberOfElements - 1]
					- prefixSumOdd[i] == prefixSumOdd[i - 1] + prefixSumEven[numberOfElements - 1] - prefixSumEven[i])
			{
				countOfSpecialIndexes++;
			}
		}
		return countOfSpecialIndexes;
	}
}
