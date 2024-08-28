package com.aditya;

/**
 * Given an array A of length N, return the subarray from B to C.
 */
public class SubarrayInRange
{
	public int[] solve(int[] A, int B, int C)
	{
		int lengthOfSubarray = C - B + 1;
		int[] subarray = new int[C - B + 1];
		for (int index = 0; index < lengthOfSubarray; index++)
		{
			subarray[index] = A[B++];
		}
		return subarray;
	}
}
