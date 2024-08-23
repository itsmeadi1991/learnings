package com.aditya;

/**
 * Given an integer array A of size N and an integer B, you have to return the
 * same array after rotating it B times towards the right.
 */
public class ArrayRotation
{
	public int[] solve(int[] A, int B)
	{
		B = B % A.length;
		swap(A, 0, A.length - 1);
		swap(A, 0, B - 1);
		swap(A, B, A.length - 1);
		return A;
	}

	public void swap(int[] A, int l, int r)
	{
		while (l < r)
		{
			int temp = A[l];
			A[l] = A[r];
			A[r] = temp;
			l++;
			r--;
		}
	}
}
