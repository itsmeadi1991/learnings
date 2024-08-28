package com.aditya;

/**
 * You have given a string A having Uppercase English letters. You have to find
 * the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
 */
public class SubsequenceAG
{
	public long solve(String A)
	{
		int lengthOfString = A.length();
		int numberOfA = 0;
		long count = 0;
		for (int i = 0; i < lengthOfString; i++)
		{
			if (A.charAt(i) == 'A')
			{
				numberOfA++;
			}
			if (A.charAt(i) == 'G')
			{
				count += numberOfA;
			}
		}
		return count;
	}
}
