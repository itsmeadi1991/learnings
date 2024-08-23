package com.aditya;

/**
 * Given an array A of N integers. Count the number of elements that have at
 * least 1 elements greater than itself.
 * 
 */
public class ArrayElementsWithGreaterElements
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
		int count = 0;
		for (int element : A)
		{
			if (element != max)
			{
				count++;
			}
		}
		return count;
	}
}
