package test50;

import java.util.Scanner;
/**
 * @author Martin
 *������49�� TestString2.java
 *��Ŀ�������ַ������Ӵ����ֵĴ��� 
 */
public class TestString2 {
/**
	 * ��str1�в���str2�ĸ���
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static int findString(String str1, String str2){
		int count = 0;
		char[] chs1 = str1.toCharArray();
		char[] chs2 = str2.toCharArray();
		for(int i=0,j=0; i<chs1.length; i++){
			for(j=0; j<chs2.length; j++){
				if(chs1[i+j] != chs2[j])
					break;
			}
			if(j == chs2.length){//��ȫƥ��
				count++;
				i = i + j - 1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����ַ���:");
		String str1 = s.next();
		System.out.println("����Ҫ���ҵ��ַ���:");
		String str2 = s.next();
		
		System.out.println("���ҵ��ĸ�����" + findString(str1, str2));
	}
}
/* 
�����ַ���:
asdfasdfasdf
����Ҫ���ҵ��ַ���:
asdf
���ҵ��ĸ�����3
 */