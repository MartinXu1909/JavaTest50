package test50;

import java.util.Scanner;
/**
 * @author Martin
 *������36�� Array1.java?
 *��Ŀ����n��������ʹ��ǰ�����˳�������m��λ�ã����m���������ǰ���m����?
 *1 2 3 4 5 6 7
 *    1 2 3 4 5 6 7
 *6 7 1 2 3 4 5
 */
public class Array1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����������ĸ�����");
		int n = input.nextInt();
		System.out.println("�������ƶ���λ����");
		int m = input.nextInt();
		System.out.println("������"+n+"��������");
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=input.nextInt();
		}
		System.out.println("�����������Ϊ��");
		for(int i=0;i<n;i++){
			System.out.print(" "+a[i]);
		}
		System.out.println();
		
		System.out.println("�ƶ�"+m+"λ������飺");
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
����������ĸ�����
7
�������ƶ���λ����
2
������7��������
1 2 3 4 5 6 7
�����������Ϊ��
 1 2 3 4 5 6 7
�ƶ�2λ������飺
6 7 1 2 3 4 5
 */