package test50;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Martin
 *������48�� TestCode.java
 *��Ŀ��ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ����ܹ������£�ÿλ���� 
 *������5,Ȼ���úͳ���10��������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
 */
public class TestCode {
	
	public static void encrypt(int[] a){
		int cup = 0;
		for(int i=0; i<4; i++){
			a[i] = (a[i] + 5) % 10;
		}
		cup = a[0];
		a[0] = a[3];
		a[3] = cup;
		
		cup = a[1];
		a[1] = a[2];
		a[2] = cup;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[4];
		for(int i=0; i<4; i++){
			System.out.print("�����"+(i+1)+"λ����");
			a[i] = s.nextInt();
		}
		encrypt(a);
		for(int i=0; i<4; i++){
			System.out.print(a[i]);
		}
	}
}
/* 
�����1λ����5
�����2λ����6
�����3λ����3
�����4λ����9
4810
 */