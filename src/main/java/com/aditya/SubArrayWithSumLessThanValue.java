package com.aditya;

/**
 * You are given an integer array C of size A. Now you need to find a subarray
 * (contiguous elements) so that the sum of contiguous elements is maximum. But
 * the sum must not exceed B.
 */
public class SubArrayWithSumLessThanValue
{
	public int maxSubarray(int A, int B, int[] C)
	{
		int ans = 0;
		for (int start = 0; start < A; start++)
		{
			int sum = 0;
			for (int end = start; end < A; end++)
			{
				sum += C[end];
				if (sum <= B)
				{
					ans = max(sum, ans);
				}
				else
				{
					break;
				}
			}
		}
		return ans;
	}

	public int max(int arg1, int arg2)
	{
		if (arg1 > arg2)
		{
			return arg1;
		}
		else
		{
			return arg2;
		}
	}
}
