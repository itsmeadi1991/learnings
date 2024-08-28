package com.aditya;

/**
 * You are given a 2D integer matrix A, return a 1D integer array containing
 * row-wise sums of original matrix.
 */
public class SumOfRows
{
	public int[] solve(int[][] A)
	{
		int[] result = new int[A.length];
		for (int i = 0; i < A.length; i++)
		{
			int sum = 0;
			for (int j = 0; j < A[i].length; j++)
			{
				sum += A[i][j];
			}
			result[i] = sum;
		}
		return result;
	}
}
