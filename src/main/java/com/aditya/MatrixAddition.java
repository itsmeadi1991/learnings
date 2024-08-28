package com.aditya;

/**
 * You are given two matrices A & B of same size, you have to return another
 * matrix which is the sum of A and B.
 */
public class MatrixAddition
{
	public int[][] solve(int[][] A, int[][] B)
	{
		int[][] result = new int[A.length][A[0].length];
		for (int i = 0; i < A.length; i++)
		{
			for (int j = 0; j < A[i].length; j++)
			{
				result[i][j] = A[i][j] + B[i][j];
			}
		}
		return result;
	}
}
