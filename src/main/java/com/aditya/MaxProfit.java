package com.aditya;

/**
 * Say you have an array, A, for which the ith element is the price of a given
 * stock on day i. If you were only permitted to complete at most one
 * transaction (ie, buy one and sell one share of the stock), design an
 * algorithm to find the maximum profit. Return the maximum possible profit.
 */
public class MaxProfit
{
	public int maxProfit(final int[] A)
	{
		int lengthOfArray = A.length;
		if (lengthOfArray < 2)
		{
			return 0;
		}
		int maxProfit = 0;
		int max = A[lengthOfArray - 1];
		for (int i = lengthOfArray - 2; i >= 0; i--)
		{
			if (A[i] > max)
			{
				max = A[i];
			}
			int profit = max - A[i];
			if (profit > maxProfit)
			{
				maxProfit = profit;
			}
		}
		return maxProfit;
	}
}
