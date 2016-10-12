package test50;
import java.util.Scanner;
/**
 * @author Martin
 *������44�� TestEven.java
 *��Ŀ��һ��ż�����ܱ�ʾΪ��������֮�͡�
 */
public class TestEven {
/**
	 * �ж�n�ǲ�������
	 * @param n
	 * @return
	 */
	public static boolean isPrimeNumber(int n){
		if(n < 2)return false;
		
		for(int i=2; i<n; i++){
			if(n%i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		if(n%2 != 0){
			System.out.println("����Ĳ���ż��");
			return;
		}
		
		for(int i=2; i<n; i++){
			if(isPrimeNumber(i) && isPrimeNumber(n - i)){
				System.out.println(n + " = " + i + "+" + (n-i));
				return;
			}
		}
	}
}
/* 
12
12 = 5+7

998
998 = 7+991

35
����Ĳ���ż��
 */