package test50;

import java.util.*;
/**
 *������45��TestPrime9.java
 * ��Ŀ���ж�һ�������ܱ�����9����
 * ��Ŀ���˰ɣ��ܱ�9�����ľͲ��������ˣ����Ըĳ������ˡ�
 */
public class TestPrime9 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = s.nextInt();
		int tmp = num;
		int count = 0;
		for(int i = 0 ; tmp%9 == 0 ;){
			tmp = tmp/9;
			count ++;
			}
		System.out.println(num+"�ܹ���"+count+"��9������");
	}
}
/* 
������һ��������63
63�ܹ���1��9������

������һ��������81
81�ܹ���2��9������

������һ��������9999
9999�ܹ���1��9������
 */