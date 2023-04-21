package sortingAlgorithm;

import java.util.Arrays;

public class heapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {15,30,8,10,16,50,20,60};
		System.out.println(Arrays.toString(arr));
		BuildMaxHeap(arr);
		//print sorted array
		System.out.println(Arrays.toString(arr));
	}

	public static void BuildMaxHeap(int[] arr) {
		int size = arr.length;
		int start=(arr.length/2)-1; //start = first leaf node
		for(int i=start;i>=0;i--) {
			heapify(arr,size,i);
		}
		System.out.println(Arrays.toString(arr));
		// One by one extract an element from heap
        for (int i = arr.length - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            // call max heapify on the reduced heap
            System.out.println(i);
            heapify(arr, i, 0);
            System.out.println(Arrays.toString(arr));
        }
	}

	public static void heapify(int[] arr, int size, int i) {
		int max=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<size&&arr[left]>arr[max]) {
			max=left;
		}
		if(right<size&&arr[right]>arr[max]) {
			max=right;
		}
		if (max != i) {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;
    		heapify(arr,size,max);
		}
	}
}
