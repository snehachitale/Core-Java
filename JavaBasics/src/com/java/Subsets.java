package com.java;

import java.util.*;

public class Subsets { 

static int subsetCount(int array[], int K, int N)
{
	//Sorting an array of elements
	Arrays.sort(array);

	int leftIndex, rightIndex;
	leftIndex = 0;
	rightIndex = N - 1;

	//Storing count of subsets
	int subset = 0;

	while (leftIndex <= rightIndex)
	{
		if (array[leftIndex] + array[rightIndex] <= K)
		{

			//Finding count of possible subsets
			subset += Math.pow(2, rightIndex - leftIndex);
			leftIndex++;
		}
		else
		{
			rightIndex--;
		}
		
	}
	
	//Return final value of subsets
	return subset;
}

	public static void main(String[] args)
	{
		
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int N = s.nextInt();
        
        int array[] = new int[N];
        System.out.println("Enter an array elements:");
        for(int i = 0; i < N; i++)
        {
            array[i] = s.nextInt();
        }
	
        System.out.println("Enter the sum of subsets:");
        int K = s.nextInt();
        
        //Printing number of subsets S which satisfies condition: min[S] + max[S] <= K
		System.out.print("Number of subsets:"+subsetCount(array, K, N));
		s.close();
	}
}


