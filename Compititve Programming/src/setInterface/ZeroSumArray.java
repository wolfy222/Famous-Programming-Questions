/*
 *Find if there is a subarray with 0 sum
	Given an array of positive and negative numbers, 
	find if there is a subarray (of size at-least one) with 0 sum. 
 */package setInterface;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumArray
{
	public static void main(String[] args) 
	{
		int a[] = {2,1,3,-4,2};
		boolean found = false;
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int element : a)
		{
			set.add(sum);
			sum += element;
			if(set.contains(sum))
			{
				found = true;
				break;				
			}
		}
		System.out.println("Found : "+found);
	}
}
