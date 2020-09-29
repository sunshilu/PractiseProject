package system.sort;

import java.util.Arrays;

public class practiseSort {
	public static void main(String[] args) {
		new practiseSort().bubbleSort2();
	}

	public void maoPao() {
		int[] arr1 = { 16, 32, 15, 62, 33, 42, 25, 34 };
		int temp = 0;
		Boolean flag;
		int n = 0;
		int f = arr1.length - 1;
		int k = 0;
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < arr1.length - 1; i++) {
			flag = false;
			n = f;
			for (int j = 0; j < arr1.length - 1 - i; j++) {
				if (arr1[j] > arr1[j + 1]) {
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
					flag = true;
					f = j;
					k++;
				}
			}
			if (!flag) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(k);
	}

	private void bubbleSort2() {
		int[] is = { 16, 32, 15, 62, 33, 42, 25, 34 };
		int handleCount = 0;
		int swapCount = 0;
		int temp = 0;
		int n = is.length - 1;
		for (int i = 0; i < is.length - 1; i++) {
			int newN = 0;
			for (int j = 0; j < n; j++) {
				if (is[j] > is[j + 1]) {
					temp = is[j];
					is[j] = is[j + 1];
					is[j + 1] = temp;
					swapCount++;
					newN = j + 1;
				}
				handleCount++;
			}
			n = newN;
			if (n == 0) {// 位置没有变化说明已经交换好了,跳出循环
				break;
			}
			System.out.println(Arrays.toString(is));
			System.out.println(n);
		}
		System.out.println(Arrays.toString(is));
//		System.out.println(k);
	}
}
