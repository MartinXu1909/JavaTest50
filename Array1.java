package test50;

import java.util.Scanner;
/**
 * @author Martin
 *【程序36】 Array1.java?
 *题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数?
 *1 2 3 4 5 6 7
 *    1 2 3 4 5 6 7
 *6 7 1 2 3 4 5
 */
public class Array1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数组的个数：");
		int n = input.nextInt();
		System.out.println("请输入移动的位数：");
		int m = input.nextInt();
		System.out.println("请输入"+n+"个整数：");
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=input.nextInt();
		}
		System.out.println("你输入的数组为：");
		for(int i=0;i<n;i++){
			System.out.print(" "+a[i]);
		}
		System.out.println();
		
		System.out.println("移动"+m+"位后的数组：");
		int[] b = new int[m];
		for(int i=0;i<m;i++){
			b[i]=a[n-m+i];
		}
		for(int i=n-1;i>=m;i--){
			a[i] = a[i-m];
		}
		for(int i =0 ;i<m;i++){
			a[i]=b[i];
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
	}
}
/* 
请输入数组的个数：
7
请输入移动的位数：
2
请输入7个整数：
1 2 3 4 5 6 7
你输入的数组为：
 1 2 3 4 5 6 7
移动2位后的数组：
6 7 1 2 3 4 5
 */