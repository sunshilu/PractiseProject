package system.sort;

import java.util.Arrays;

public class SortModule {
	static int[] arr1 = { 16, 32, 15, 62, 33, 42, 25, 34 };
	static int temp = 0;

	public static void main(String[] args) {
//		bubbleSort();
//		selectionSort();
		InsertionSort();
	}

//	冒泡排序
//	比较相邻元素，大的放到后面
//	每循环一次，最大值放在最后
//	优化：boolean标识此次内层循环是否进行了排序，如果未进行，说明排序已经完成。
//	 	  记录最后一次交换位置，说明之后的元素已经排好顺序，设置下次内层循环次数为交换位置
	public static void bubbleSort() {
		int[] arr = arr1.clone();
		System.out.println(Arrays.toString(arr));
		Boolean flag;
		int f = arr.length - 1;
		int n = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			flag = false;
			n = f;
			for (int j = 0; j < n; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
					f = j;
				}
			}
			if (flag == false) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

//	选择排序（表现最稳定的算法之一）
//	比较当前位置元素和剩余元素，选出最大/最小值
//	每次循环都找出剩余元素中最大/最小值，记录下标，内层循环结束，将最大/最小值与当前位置元素交换	
	public static void selectionSort() {
//		int[] arr = arr1.clone();
//		System.out.println(Arrays.toString(arr));
//		int temp = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		int[] arr = arr1.clone();
		System.out.println(Arrays.toString(arr));
		int minIndex;
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void InsertionSort() {
		int[] arr = arr1.clone();
		System.out.println(Arrays.toString(arr));
		int Index;
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i]<arr[j]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
