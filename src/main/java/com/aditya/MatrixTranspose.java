package com.aditya;

/**
 * Given a 2D integer array A, return the transpose of A. The transpose of a
 * matrix is the matrix flipped over its main diagonal, switching the matrix's
 * row and column indices.
 */
public class MatrixTranspose
{
	public int[][] solve(int[][] A)
	{
		int rows = A.length;
		int columns = A[0].length;
		int[][] result = new int[columns][rows];
		for (int i = 0; i < columns; i++)
		{
			for (int j = 0; j < rows; j++)
			{
				result[i][j] = A[j][i];
			}
		}
		return result;
	}
}
