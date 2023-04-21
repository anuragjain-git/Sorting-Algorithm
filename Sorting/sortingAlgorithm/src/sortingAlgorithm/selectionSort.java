package sortingAlgorithm;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,2,3,6,5};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[min]>arr[j]) {
					min=j;
				}
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
				System.out.println(Arrays.toString(arr));
			}
		}
	}

}
