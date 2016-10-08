package test50;
/**
 * @author Martin
 *������21��TestJieCheng.java 
 *��Ŀ����1+2!+3!+...+20!�ĺ� 
 *1.����������˳���ֻ�ǰ��ۼӱ�����۳ˡ�
 */
public class TestJieCheng {
/**
	 * ��n�Ľ׳�
	 * @param n
	 * @return
	 */
	public static long jieCheng(int n){
		if(n == 1) return 1;
		else return jieCheng(n-1)*n;
	}
	
	public static void main(String[] args) {
		long ans = 0;
		for(int i=1; i<=20; i++){
			ans = ans + jieCheng(i);
		}
		System.out.println(ans);
	}
}
/* 
2561327494111820313
 */
