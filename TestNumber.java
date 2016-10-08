package test50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * @author Martin
 *������24��TestNumber.java
 *��Ŀ����һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
 */
public class TestNumber {
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
		System.out.println("��һ��������5λ��������:");
		Scanner s = new Scanner(System.in);
		long n = 0;
		if(s.hasNext()) n = s.nextInt();
		
		List<Integer> l = explodeNumber(n);
		System.out.println("����"+l.size()+"λ��");
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
	}
}
/* 
12345
����5λ��
54321
 */