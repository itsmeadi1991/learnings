package com.aditya;

public class Flip
{
	public static void main(String[] args)
	{
		Flip app = new Flip();
		app.flip("010");
	}

	public int[] flip(String A)
	{
		int left = 0, right = 0, cSum = 0, mSum = 0;
		int[] answer = new int[2];
		for (int i = 0; i < A.length(); i++)
		{
			char ch = A.charAt(i);
			if (ch == '0')
			{
				cSum++;
			}
			else
			{
				cSum--;
			}
			if (cSum > mSum)
			{
				mSum = cSum;
				answer[0] = left + 1;
				answer[1] = right + 1;
			}
			if (cSum < 0)
			{
				cSum = 0;
				left = i + 1;
				right = i + 1;
			}
			else
			{
				right++;
			}
		}
		if (mSum == 0)
		{
			return new int[] {};
		}
		else
		{
			return answer;
		}
	}
}
