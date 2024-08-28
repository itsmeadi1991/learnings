package com.aditya;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array A containing N distinct integers, you have to find all
 * the leaders in array A. An element is a leader if it is strictly greater than
 * all the elements to its right side.
 */
public class GreaterThanAllElementsOnRightInArray
{
	public int[] solve(int[] A)
	{
		int lengthOfTheArray = A.length;
		List<Integer> answer = new ArrayList<>();
		answer.add(A[lengthOfTheArray - 1]);
		int max = A[lengthOfTheArray - 1];
		for (int i = lengthOfTheArray - 2; i >= 0; i--)
		{
			if (A[i] > max)
			{
				max = A[i];
				answer.add(A[i]);
			}
		}
		int[] result = new int[answer.size()];
		for (int i = 0; i < answer.size(); i++)
		{
			result[i] = answer.get(i);
		}
		return result;
	}
}
