package test50;

import java.util.Scanner;
/**
 * @author Martin
 *������46�� TestString.java
 *��Ŀ�������ַ������ӳ���
 *ע��ת�������������,ʵ��ʹ��String.concat()
 */
public class TestString {
	public static String connextString(String str1, String str2){
		byte[] buf = new byte[str1.length() + str2.length()];
		str1.getBytes(0, str1.length(), buf, 0);
		str2.getBytes(0, str2.length(), buf, str1.length());
		return new String(buf);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����һ���ַ���:");
		String str1 = s.next();
		System.out.println("����ڶ����ַ���:");
		String str2 = s.next();
		System.out.println(connextString(str1, str2));
	}
}
/* 
�����һ���ַ���:
ewrw
����ڶ����ַ���:
343sds
ewrw343sds
 */