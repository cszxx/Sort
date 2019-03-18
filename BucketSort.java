
public class BucketSort {
	public static void bucketSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		int[] bucket = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			bucket[arr[i]]++;//桶数组下标值为arr数组中的数据值，若已存在数据，则++
		}
		int i = 0;
		for (int j = 0; j < bucket.length; j++) {
			while (bucket[j]-- > 0) {//此位置有数据
				arr[i++] = j;
			}
		}
	}
	
	public static void main(String [] args) {
		int arr[] = {1,5,3,7,4,9,6,8,0,2};
		bucketSort(arr);
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]);
		}
	}
}
