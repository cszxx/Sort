
public class InsertionSort {
	public static void main(String [] args) {
		int arr[] = {1,5,3,7,4,9,6,8,0,2};
		if(arr == null || arr.length < 2) {
			return;
		}else {
			for (int i = 1; i < arr.length; i++) {
				for (int j = i-1; j >= 0 && arr[j] > arr[j+1]; j--) {
					swap(arr, j, j+1);
				}
			}
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		/*
		 *arr[i] = arr[i] ^ arr[j]; 
		 *arr[j] = arr[i] ^ arr[j];
		 *arr[i] = arr[i] ^ arr[j];
		*/
	}
}
