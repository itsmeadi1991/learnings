package com.aditya;

/**
 * You are given a matrix A and and an integer B, you have to perform scalar
 * multiplication of matrix A with an integer B.
 */
public class MatrixScalarProduct
{
	public int[][] solve(int[][] A, int B)
	{
		int[][] result = new int[A.length][A[0].length];
		for (int i = 0; i < A.length; i++)
		{
			for (int j = 0; j < A[i].length; j++)
			{
				result[i][j] = A[i][j] * B;
			}
		}
		return result;
	}
}
