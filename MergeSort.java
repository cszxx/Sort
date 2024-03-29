
public class MergeSort {
	public static void main(String [] args) {
		int arr[] = {1,5,3,7,4,9,6,8,0,2};
		int L = 0;
		int R = arr.length-1;
		if (arr == null || arr.length < 2) {
			return; 
		}
		processSort(arr, L, R);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]  );
		}
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int [] help = new int[r-l+1];
		int i = 0;
		int p1 = l;
		int p2 = mid + 1;
		while(p1 <= mid && p2 <= r) {
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		while (p1<=mid) {
			help[i++] = arr[p1++];
		}
		while (p2 <= r) {
			help[i++] = arr[p2++];
		}
		for (int j = 0; j < help.length; j++) {
			arr[j+l] = help[j];
		}
	}

	private static void processSort(int[] arr, int l, int r) {
		if (l == r) {
			return;
		}
		int mid = l + ((r - l) >> 1);
			processSort(arr, l, mid);
			processSort(arr, mid+1, r);
			merge(arr, l, mid, r);
	}
}
