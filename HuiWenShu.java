package test50;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Martin
 *������25�� HuiWenShu.java
 *��Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 */
public class HuiWenShu {
	
	/**
	 * �ֽ�����
	 * @param n
	 * @return
	 */
	public static List<Integer> explodeNumber(long n){
		List<Integer> l = new ArrayList<Integer>();
		
		long cup = n;
		while(cup != 0){
			l.add((int) (cup%10));
			cup = cup/10;
		}
		
		return l;
	}
	
	public static void main(String[] args) {
		System.out.println("����һ����:");
		Scanner s = new Scanner(System.in);
		long n = 0;
		if(s.hasNext()) n = s.nextLong();
		
		List<Integer> l = explodeNumber(n);
		Integer[] a = (Integer[])l.toArray(new Integer[]{});
		for(int i=0; i<=a.length/2; i++) {
			if(!a[i].equals(a[a.length-i-1])){
				System.out.println("���ǻ���");
				return;
			}
		}
		System.out.println("�ǻ���");
	}
}
/* 
����һ����:
4321234
�ǻ���

����һ����:
543211234
���ǻ���
 */