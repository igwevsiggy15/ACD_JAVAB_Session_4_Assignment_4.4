package Assignment4;

public class RecursiveSort {
	public static void main(String[] args) {
		int[] arr = {1, 8, 32, 24, 15, 7};
		recursiveCall(arr, arr.length);
		for (int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	static void recursiveCall(int[] abc, int n) {
		if (n == 0 || n == 1) return;
		else {
			int c = abc.length-n;
			int min = Integer.MAX_VALUE;
			int position = -1;
			for (int i=0; i < n; i++) {
				if (abc[c+i] <= min) {
					min = abc[c+i];
					position = c+i;
				}
			}
			if (position < 0) return;
			else {
				int tmp = abc[c];
				abc[c] = abc[position];
				abc[position] = tmp;
				recursiveCall(abc, n-1);
			}
		}
	}
}