/*
 *k largest(or smallest) elements in an array | added Min Heap method
Question: Write an efficient program for printing k largest elements in an array. Elements in array can be in any order.

For example, if given array is [1, 23, 12, 9, 30, 2, 50] and you are asked for the largest 3 elements i.e., k = 3 then your program should print 50, 30 and 23.
 *
 *
Method 2 (Use temporary array)
K largest elements from arr[0..n-1]

1) Store the first k elements in a temporary array temp[0..k-1].
2) Find the smallest element in temp[], let the smallest element be min.
3-a) For each element x in arr[k] to arr[n-1]. O(n-k)
If x is greater than the min then remove min from temp[] and insert x.
3-b)Then, determine the new min from temp[]. O(k)
4) Print final k elements of temp[]

Time Complexity: O((n-k)*k). If we want the output sorted then O((n-k)*k + klogk)

Thanks to nesamani1822 for suggesting this method.

Method 3(Use Sorting)
1) Sort the elements in descending order in O(nLogn)
2) Print the first k numbers of the sorted array O(k).
Following is the implementation of above.
 *
 **/package queueInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElements 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of trials - ");
		int t = sc.nextInt();
		while(t-- != 0)
		{
			System.out.println("Enter size of array - ");
			int n = sc.nextInt();
			System.out.println("Enter the value of k - ");
			int k = sc.nextInt();
			int a[]= new int[n];
			System.out.println("Enter elements of array - ");
			for(int i=0; i<n; i++)
			{
				a[i] = sc.nextInt();
			}
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for(int i=0; i<n; i++)
			{
				if(i<k)
				{
					pq.add(a[i]);
				}
				else
				{
					if(pq.peek() < a[i])
					{
						pq.poll();
						pq.add(a[i]);
					}
				}
			}
			ArrayList<Integer> ans = new ArrayList<>(pq);
			Collections.sort(ans,Collections.reverseOrder());
			for(int x: ans)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
