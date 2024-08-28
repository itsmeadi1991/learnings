package com.aditya;

/**
 * Give a N * N square matrix A, return an array of its anti-diagonals.
 * 
 * Input:
 * 
 * 1 2
 * 
 * 3 4
 * 
 * Output:
 * 
 * 1 0
 * 
 * 2 3
 * 
 * 4 0
 */
public class AllAntiDiagonalsOfArray
{
	public int[][] diagonal(int[][] A)
	{
		int length = A.length;
		int[][] result = new int[length * 2 - 1][length];
		int rowToBeFilled = 0;
		for (int column = 0; column < A.length; column++)
		{
			int colToBeFilled = 0;
			int i = 0;
			int j = column;
			while (i < A.length && j >= 0)
			{
				result[rowToBeFilled][colToBeFilled++] = A[i][j];
				i++;
				j--;
			}
			while (colToBeFilled < A.length)
			{
				result[rowToBeFilled][colToBeFilled++] = 0;
			}
			rowToBeFilled++;
		}
		for (int row = 1; row < A.length; row++)
		{
			int colToBeFilled = 0;
			int i = row;
			int j = A.length - 1;
			while (i < A.length && j >= 0)
			{
				result[rowToBeFilled][colToBeFilled++] = A[i][j];
				i++;
				j--;
			}
			while (colToBeFilled < A.length)
			{
				result[rowToBeFilled][colToBeFilled++] = 0;
			}
			rowToBeFilled++;
		}
		return result;
	}
}
