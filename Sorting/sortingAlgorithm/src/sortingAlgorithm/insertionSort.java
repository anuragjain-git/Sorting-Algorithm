package sortingAlgorithm;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,2,3,6,5};
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<arr.length;i++) {
			int j = i-1;
			while(j>=0 && arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j-=1;
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}