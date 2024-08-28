package com.aditya;

import java.util.ArrayList;

public class AddOneToLastElementOfArray
{
	public static void main(String[] args)
	{
//		int[] input = { 0, 3, 7, 6, 4, 0, 5, 5, 5 };
//		int[] input = { 9 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(9);
		AddOneToLastElementOfArray app = new AddOneToLastElementOfArray();
		app.plusOne(list);
	}

	public ArrayList<Integer> plusOne(ArrayList<Integer> list)
	{
		int carry = 1;
		int number;
		int size = list.size();

		for (int i = size - 1; i >= 0; i--)
		{
			number = list.get(i);
			number += carry;
			carry = 0;
			if (number == 10)
			{
				number = 0;
				carry = 1;
			}
			list.set(i, number);
		}

		ArrayList<Integer> res = new ArrayList<Integer>();
		if (carry == 1)
			res.add(1);

		for (int x : list)
		{
			if (x == 0 && res.size() == 0)
				continue;
			res.add(x);
		}

		return res;

	}
}
