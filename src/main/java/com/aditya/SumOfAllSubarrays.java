package com.aditya;

/**
 * You are given an integer array A of length N. You have to find the sum of all
 * subarray sums of A. More formally, a subarray is defined as a contiguous part
 * of an array which we can obtain by deleting zero or more elements from either
 * end of the array. A subarray sum denotes the sum of all the elements of that
 * subarray. Note : Be careful of integer overflow issues while calculations.
 * Use appropriate datatypes.
 */
public class SumOfAllSubarrays
{
	public long subarraySum(int[] A)
	{
		long answer = 0;
		int length = A.length;
		for (int index = 0; index < length; index++)
		{
			answer += ((long) (index + 1) * (length - index) * A[index]);
		}
		return answer;
	}
}
