package sortingAlgorithm;

import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,2,5,4,6};
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
        	swapped=true;
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        	if(swapped==true) {
        		break;
        	}
		}
        System.out.println(Arrays.toString(arr));
	}
}