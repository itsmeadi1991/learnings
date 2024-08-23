package com.aditya;

/**
 * Given an array A of size N. You need to find the sum of Maximum and Minimum
 * element in the given array.
 */
public class MaxMinOfArray
{
	public int solve(int[] A)
	{
		int max = A[0];
		int min = A[0];
		for (int element : A)
		{
			if (element > max)
			{
				max = element;
			}
			if (element < min)
			{
				min = element;
			}
		}
		return max + min;
	}
}
