package jp.codewindy.sort_algorithm;

import java.util.Arrays;

/**
 * 定义一个静态方法 实现快速排序
 * 
 * @author yui
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		// 测试方法
		int[] arr = { 22, 88, 33, 99, 44 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println("快速排序的结果是 : ==" + Arrays.toString(arr));
		System.out.println("快速排序的结果2是 : ==" + arr2String(arr));
	}

	/**
	 * 将数组转化成toString 的方法
	 * @param arr
	 * @return
	 */
	private static String arr2String(int[] arr) {
		// TODO Auto-generated method stub
		if (arr == null)
			return "null";
		int iMax = arr.length - 1;
		if (iMax == -1)
			return "[]";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0;; i++) {
			sb.append(arr[i]);
			if (i == iMax)
				return sb.append("]").toString();
			sb.append(", ");
		}

	}

	/**
	 * 
	 * @param arr
	 *            需要排序的数组
	 * @param left
	 *            最左边
	 * @param right
	 *            最右边
	 */
	public static void quickSort(int[] arr, int left, int right) {
		// 实现快速排序
		int i = left;
		int j = right;
		int pivot = ((arr[i] + arr[j]) >>> 1);// 中间值pivot 通过位运算求出
		while (i < j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i > j)
				break; // 如果发生越界就跳出循环

			swap(arr, i, j); // 交换元素

			/**
			 * 假设i 先到达pivot 就在那里等待j 执行后面的语句
			 */
			if (arr[i] == pivot)
				--j;
			if (arr[j] == pivot)
				++i;

		}
		if (i == j) {
			i++;
			j--;
		}

		// 递归实现
		if (left < j)
			quickSort(arr, left, j);
		if (i < right)
			quickSort(arr, i, right);
	}

	/**
	 * 交换元素
	 * 
	 * @param arr
	 *            传入参数数组
	 * @param i
	 *            左边起始点 i
	 * @param j
	 *            右边起始点j
	 */
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
