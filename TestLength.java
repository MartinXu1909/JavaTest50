package test50;
import java.util.Scanner;
/**
 * @author Martin
 *������38�� TestLength.java
 *��Ŀ��дһ����������һ���ַ����ĳ��ȣ���main�����������ַ�����������䳤�ȡ�
 */
public class TestLength {
public static int getLength(String str){
		return str.toCharArray().length;
	}
	
	public static void main(String[] args) {
		System.out.println("��������ַ�����");
		String str = new Scanner(System.in).next();
		System.out.println("����ַ�������Ϊ:"+getLength(str));
	}
}
/* 
��������ַ�����
123456789
����ַ�������Ϊ:9
 */