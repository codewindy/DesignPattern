package jp.codewindy.sort_algorithm;

import java.util.Arrays;

/**
 * ����һ����̬���� ʵ�ֿ�������
 * 
 * @author yui
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		// ���Է���
		int[] arr = { 22, 88, 33, 99, 44 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println("��������Ľ���� : ==" + Arrays.toString(arr));
		System.out.println("��������Ľ��2�� : ==" + arr2String(arr));
	}

	/**
	 * ������ת����toString �ķ���
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
	 *            ��Ҫ���������
	 * @param left
	 *            �����
	 * @param right
	 *            ���ұ�
	 */
	public static void quickSort(int[] arr, int left, int right) {
		// ʵ�ֿ�������
		int i = left;
		int j = right;
		int pivot = ((arr[i] + arr[j]) >>> 1);// �м�ֵpivot ͨ��λ�������
		while (i < j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i > j)
				break; // �������Խ�������ѭ��

			swap(arr, i, j); // ����Ԫ��

			/**
			 * ����i �ȵ���pivot ��������ȴ�j ִ�к�������
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

		// �ݹ�ʵ��
		if (left < j)
			quickSort(arr, left, j);
		if (i < right)
			quickSort(arr, i, right);
	}

	/**
	 * ����Ԫ��
	 * 
	 * @param arr
	 *            �����������
	 * @param i
	 *            �����ʼ�� i
	 * @param j
	 *            �ұ���ʼ��j
	 */
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
