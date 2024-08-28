package com.aditya;

/**
 * You are given an array A of integers of size N. Your task is to find the
 * equilibrium index of the given array The equilibrium index of an array is an
 * index such that the sum of elements at lower indexes is equal to the sum of
 * elements at higher indexes. If there are no elements that are at lower
 * indexes or at higher indexes, then the corresponding sum of elements is
 * considered as 0.
 */
public class EquilibriumIndex
{
	public int solve(int[] A)
	{
		int numberOfElements = A.length;
		long[] pSum = new long[numberOfElements];
		pSum[0] = A[0];
		for (int i = 1; i < numberOfElements; i++)
		{
			pSum[i] = pSum[i - 1] + A[i];
		}

		for (int i = 0; i < numberOfElements; i++)
		{
			if (i == 0)
			{
				if (pSum[numberOfElements - 1] - pSum[0] == 0)
				{
					return i;
				}
			}
			else if (i == numberOfElements - 1)
			{
				if (pSum[i - 1] == 0)
				{
					return i;
				}
			}
			else
			{
				if (pSum[i - 1] == pSum[numberOfElements - 1] - pSum[i])
				{
					return i;
				}
			}
		}
		return -1;
	}
}
