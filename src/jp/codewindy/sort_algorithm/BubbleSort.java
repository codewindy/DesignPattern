package jp.codewindy.sort_algorithm;

/**
 * 冒泡排序 简单实现
 * 
 * @author yui
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 44, 77, 99, 33, 11, 66 };
		bubbleSort(arr);
		System.out.println("冒泡排序算法的实现...="+arr2String(arr));

	}

	private static String arr2String(int[] arr) {
		// TODO Auto-generated method stub
		if (arr == null)
			return "null";
		int iMax = arr.length - 1;
		if (iMax == -1)
			return "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0;; i++) {
			sb.append(arr[i]);
			if (i == iMax)
				return sb.append("]").toString();

			sb.append(", ");
		}

	}

	private static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j]>arr[j+1]){
					swap(arr, j, j + 1);
				}
			}
		}

	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
