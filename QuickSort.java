
public class QuickSort {
	private static void quickSort(int[] arr, int l, int r) {
		if (l < r) {
			swap(arr, l + (int)((Math.random() * (r - l + 1))), r);
			int [] p = partitionNum(arr, l, r);
			quickSort(arr, l, p[0]-1);
			quickSort(arr, p[1]+1, r);
		}
	}

	private static int[] partitionNum(int[] arr, int l, int r) {
		int less = l - 1;
		int more = r;
		while (l < more) {
			if (arr[l] < arr[r]) {
				swap(arr, ++less, l++);
			}else if (arr[l] > arr[r]) {
				swap(arr, --more, l);
			}else {
				l++;
			}
		}
		swap(arr, more, r);
		return new int[] {less+1, more};
	}

	private static void swap(int[] arr, int i, int l) {
		int temp = arr[i];
		arr[i] = arr[l];
		arr[l] = temp;
	}
	public static void main(String [] agrs) {
		int[] arr = {1,5,3,7,4,9,6,8,0,2,5};
		int L = 0;
		int R = arr.length - 1;
		if (arr == null || arr.length < 2) {
			return;
		}
		int []p = partitionNum(arr, L, R);
		quickSort(arr, L, p[0] - 1);
		quickSort(arr, p[1] + 1, R);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]  );
		}
	}
}

