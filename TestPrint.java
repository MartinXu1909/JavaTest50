package test50;

import java.util.Scanner;
/**
 * @author Martin
 *������47�� TestPrint.java
 *��Ŀ����ȡ7������1��50��������ֵ��ÿ��ȡһ��ֵ�������ӡ����ֵ�����ģ���
 */
public class TestPrint {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[7];
		for(int i=0; i<7; i++){
			System.out.print("�����"+(i+1)+"��������");
			a[i] = s.nextInt();
		}
		
		for(int i=0; i<7; i++){
			for(int j=0; j<a[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/* 
�����1��������1
�����2��������2
�����3��������3
�����4��������4
�����5��������5
�����6��������6
�����7��������7
*
**
***
****
*****
******
*******
 */