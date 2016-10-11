package test50;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Martin
 * ������37�� Test3Quit.java *��200��С��������һ��ԲȦ��������һ��С���ѿ�ʼ���α��1��200����1��С���ѿ�ʼѭ��1��3������
 *����3��С���Ѿ��˳�����дһ��JavaӦ�ó��򣬼�������һ��С���ѵĺ����Ƕ��١�
 */
public class Test3Quit {
/**
	 * @param l ʣ��С����List
	 * @param n ��n����ʼ����
	 * @param m ����m�����˳�
	 * @return ���һ��С���ѵĺ���
	 */
	public static int play(List<Integer> l, int n, int m){
		int s = l.size();
		if(s <= 1) return l.get(0);
		else {
			n = n + m - 1;
			while(n >= s)
				n = n-s;
			
			l.remove(n);
			return play(l, n, m);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("�����ж��ٸ�С����:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		List<Integer> l = new ArrayList<Integer>();
		for(int i=1; i<=n; i++){
			l.add(i);
		}
		System.out.println(play(l, 0, 3));
	}
}
/* 
�����ж��ٸ�С����:
200
128
 */