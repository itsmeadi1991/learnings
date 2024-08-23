package com.aditya;

/**
 * You are given an integer array A of length N. You are also given a 2D integer
 * array B with dimensions M x 2, where each row denotes a [L, R] query. For
 * each query, you have to find the sum of all elements from L to R indices in A
 * (0 - indexed). More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1]
 * + A[R] for each query.
 */
public class FindSumOfSubarray
{
	public long[] rangeSum(int[] A, int[][] B)
	{
		int numOfQueries = B.length;
		int numOfElements = A.length;
		long[] result = new long[numOfQueries];
		long[] pSum = new long[numOfElements];
		pSum[0] = A[0];
		for (int i = 1; i < numOfElements; i++)
		{
			pSum[i] = pSum[i - 1] + A[i];
		}
		for (int i = 0; i < numOfQueries; i++)
		{
			int l = B[i][0];
			int r = B[i][1];
			if (l == 0)
			{
				result[i] = pSum[r];
			}
			else
			{
				result[i] = pSum[r] - pSum[l - 1];
			}
		}
		return result;
	}
}
