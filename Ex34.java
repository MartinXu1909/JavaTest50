package test50;

import java.util.Scanner;

/**
 *【程序34】 Ex34.java
 * 题目：输入3个数a,b,c，按大小顺序输出
 * 1.程序分析：利用指针方法。
*/
public class Ex34{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入a,b,c三个数: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int array[] = {a, b, c};
		for(int i = 1; i <= array.length; i++){
			for(int j = i + 1; j <= i; j++){
				if(array[i] > array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + ", ");
		}
		// int [] arrays = {800, 56, 500};
		// for(int i = arrays.length; --i >= 0;){
			// for(int j = 0; j < i; j++){
				// if(arrays[j] > arrays[j + 1]){
					// int temp = arrays[j];
					// arrays[j] = arrays[j + 1];
					// arrays[j + 1] = temp;
				// }
			// }
		// }
		// for(int n = 0; n < arrays.length; n++)
		// System.out.println(arrays[n]);
	}
}
/* 
56
500
800

23 45 67
23, 45, 67,
 */