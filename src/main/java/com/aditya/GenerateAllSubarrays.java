package com.aditya;

/**
 * You are given an array A of N integers. Return a 2D array consisting of all
 * the subarrays of the array
 */
public class GenerateAllSubarrays
{
	public int[][] solve(int[] A)
	{
		int lengthOfArray = A.length;
		int numberOfSubarrays = lengthOfArray * (lengthOfArray + 1) / 2;
		int[][] result = new int[numberOfSubarrays][];
		for (int startIndex = 0; startIndex < A.length; startIndex++)
		{
			for (int endIndex = startIndex; endIndex < A.length; endIndex++)
			{
				updateResult(--numberOfSubarrays, A, result, startIndex, endIndex);
			}
		}
		return result;
	}

	public void updateResult(int rowNumber, int[] originalArray, int[][] arrayOfSubarrays, int startIndex, int endIndex)
	{
		arrayOfSubarrays[rowNumber] = new int[endIndex - startIndex + 1];
		int index = 0;
		for (int i = startIndex; i <= endIndex; i++)
		{
			arrayOfSubarrays[rowNumber][index++] = originalArray[i];
		}
	}
}
