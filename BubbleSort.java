
public class BubbleSort {
	public static void main(String [] args) {
		int arr[] = {1,5,3,7,4,9,6,8,0,2};
		int end = arr.length;
		if(arr == null || arr.length < 2) {
			return;
		}else {
			for(int i = end - 1; i > 0; i-- ) {
				for(int j = 0; j < i; j++) {
					if(arr[j] > arr[j+1]) {
						swap(arr, j, j+1);
					}
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
	}
}
