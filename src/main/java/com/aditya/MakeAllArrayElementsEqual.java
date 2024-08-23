package com.aditya;

/**
 * Given an integer array A of size N. In one second, you can increase the value
 * of one element by 1. Find the minimum time in seconds to make all elements of
 * the array equal.
 */
public class MakeAllArrayElementsEqual
{
	public int solve(int[] A)
	{
		int max = A[0];
		for (int element : A)
		{
			if (element > max)
			{
				max = element;
			}
		}
		int seconds = 0;
		for (int element : A)
		{
			seconds += (max - element);
		}
		return seconds;
	}
}
