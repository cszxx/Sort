
public class InversePairs {
	public static void main(String [] args) {
		int arr[] = {1,5,3,7,4,9,6,8,0,2};
		if (arr == null || arr.length <2) {
			return;
		} else {
			processMerge(arr, 0 , arr.length - 1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]  );
		}
	}

	private static void processMerge(int[] arr, int L, int R) {
		if (L == R) {
			return;
		}
		int mid = L + ((R - L) >> 1); 
		processMerge(arr, L, mid);
		processMerge(arr, mid + 1, R);
		merge(arr, L, mid, R);
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int i = 0;
		int p1 = l;
		int p2 = mid + 1;
		int help[] = new int[r - l + 1];
		while (p1 <= mid && p2 <=r) {			
			if (arr[p1] < arr[p2]) {
				help[i] = arr[p1];
				i+=1;
				p1+=1;
			} else {
				int p3 = p1;
				while(p3<=mid) {
					System.out.println("(" + arr[p3] + "," + arr[p2] + ")");
					p3+=1;
				}
				help[i] = arr[p2];				
				i+=1;
				p2+=1;
			}
		}
		while(p1 <= mid) {
			help[i++] = arr[p1++];
		}
		while(p2 <= r) {
			help[i++] = arr[p2++];
		}
		for (int j = 0; j < help.length; j++) {
			arr[j+l] = help[j];
		}
	}
}
