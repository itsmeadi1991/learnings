package com.aditya;

/**
 * You are given a n x n 2D matrix A representing an image. Rotate the image by
 * 90 degrees (clockwise). You need to do this in place.
 */
public class RotateMatrixClockwise
{
	public void solve(int[][] A)
	{
		for (int i = 0; i < A.length; i++)
		{
			for (int j = i + 1; j < A[i].length; j++)
			{
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}

		for (int i = 0; i < A.length; i++)
		{
			int left = 0;
			int right = A[i].length - 1;
			while (left < right)
			{
				int temp = A[i][left];
				A[i][left] = A[i][right];
				A[i][right] = temp;
				left++;
				right--;
			}
		}
	}
}
