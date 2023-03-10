// Find the smallest positive integer value that cannot be represented as sum of any subset of a given array

// Given an array of positive numbers, find the smallest positive integer value that cannot be 
// represented as the sum of elements of any subset of a given set. 
// The expected time complexity is O(nlogn).

// Input:  arr[] = {1, 10, 3, 11, 6, 15};
// Output: 2

// Input:  arr[] = {1, 1, 1, 1};
// Output: 5
// Java program to find the smallest positive value that cannot be
// represented as sum of subsets of a given sorted array

import java.util.Arrays;

class FindSmallestInteger {
	
	int findSmallest(int arr[], int n) {
		int res = 1;
		Arrays.sort(arr);
	
		for (int i = 0; i < n; i++) {
		if(arr[i] > res){
			return res;
		}
		else{
			res+=arr[i];
		}
		}
			
		return res;
	}

	public static void main(String[] args)	{
		FindSmallestInteger small = new FindSmallestInteger();
		int arr1[] = {1, 3, 4, 5};
		int n1 = arr1.length;
		System.out.println(small.findSmallest(arr1, n1));

		int arr2[] = {1, 2, 6, 10, 11, 15};
		int n2 = arr2.length;
		System.out.println(small.findSmallest(arr2, n2));

		int arr3[] = {1, 1, 1, 1};
		int n3 = arr3.length;
		System.out.println(small.findSmallest(arr3, n3));

		int arr4[] = {1, 1, 3, 4};
		int n4 = arr4.length;
		System.out.println(small.findSmallest(arr4, n4));

	}
}
