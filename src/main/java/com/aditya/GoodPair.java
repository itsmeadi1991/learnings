package com.aditya;

import java.util.ArrayList;

/**
 * Given an array A and an integer B. A pair(i, j) in the array is a good pair
 * if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
 */
public class GoodPair
{
	public int solve(ArrayList<Integer> A, int B)
	{
		for (int i = 0; i < A.size() - 2; i++)
		{
			for (int j = i + 1; j < A.size() - 1; j++)
			{
				if (i != j && A.get(i) + A.get(j) == B)
				{
					return 1;
				}
			}
		}
		return 0;
	}
}
