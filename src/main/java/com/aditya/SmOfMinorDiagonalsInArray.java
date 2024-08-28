package com.aditya;

/**
 * You are given a N X N integer matrix. You have to find the sum of all the
 * minor diagonal elements of A. Minor diagonal of a M X M matrix A is a
 * collection of elements A[i, j] such that i + j = M + 1 (where i, j are
 * 1-based).
 */
public class SmOfMinorDiagonalsInArray
{
	public int solve(final int[][] A)
	{
		int sum = 0;
		for (int i = 0; i < A.length; i++)
		{
			sum += A[i][A.length - 1 - i];
		}
		return sum;
	}
}
