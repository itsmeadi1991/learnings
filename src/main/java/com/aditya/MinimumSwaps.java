package com.aditya;

public class MinimumSwaps
{
	public static void main(String[] args)
	{
		MinimumSwaps app = new MinimumSwaps();
		int[] arr = { 1, 12, 10, 3, 14, 10, 5 };
		app.solve(arr, 8);
	}

	public int solve(int[] A, int B)
	{
		int answer = Integer.MAX_VALUE, windowSize = 0;
		for (int element : A)
		{
			if (element <= B)
			{
				windowSize++;
			}
		}
		int badCount = 0;
		for (int i = 0; i < A.length; i++)
		{
			if (i < windowSize)
			{
				if (A[i] > B)
				{
					badCount++;
				}
			}
			else
			{
				if (A[i] > B)
				{
					badCount++;
				}
				if (A[i - windowSize] > B)
				{
					badCount--;
				}
			}
			answer = badCount < answer ? badCount : answer;
		}
		return answer;
	}
}
