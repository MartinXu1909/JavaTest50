package test50;
import java.util.Scanner;
/**
 * @author Martin
 *������39�� Test2.java
 *��Ŀ����дһ������������nΪż��ʱ�����ú�����1/2+1/4+...+1/n,������nΪ����ʱ�����ú���
 *1/1+1/3+...+1/n(����ָ�뺯��)
 *ע��java����ò��û��ָ�뺯���ɣ�������ǲ���C++�İ����ҾͲ�����ָ�뺯���ˣ�ʵ�ֹ��ܾ����� 
 */
public class Test2 {
/**
	 * һ�������㶨�������
	 * @param n
	 * @return
	 */
	public static double sum(int n){
		double ans = 0;
		int i = 1;
		if(n%2 == 0)
			i = 2;
		
		for(; i<=n;i=i+2){
			ans = ans + 1.0/i;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		System.out.println(sum(n));
	}
}
/* 
4
0.75

3
1.3333333333333333

100
2.2496026691647115
 */