package com.aditya;

/**
 * You are given a 2D integer matrix A, return a 1D integer array containing
 * column-wise sums of original matrix.
 */
public class SumOfColumns
{
	public int[] solve(int[][] A)
	{
		int[] result = new int[A[0].length];
		for (int j = 0; j < A[0].length; j++)
		{
			int sum = 0;
			for (int i = 0; i < A.length; i++)
			{
				sum += A[i][j];
			}
			result[j] = sum;
		}
		return result;
	}
}
