package com.aditya;

/**
 * Given an array A and an integer B, find the number of occurrences of B in A.
 */
public class FindOccurrences
{
	public int solve(int[] A, int B)
	{
		int count = 0;
		for (int element : A)
		{
			if (element == B)
			{
				count++;
			}
		}
		return count;
	}
}
