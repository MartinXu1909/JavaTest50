package test50;
/**
 * @author Martin
 *������22��TestJieCheng2.java
 * ��Ŀ�����õݹ鷽����5!�� 
 * 1.����������ݹ鹫ʽ��fn=fn_1*4!
 */
public class TestJieCheng2 {
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
		System.out.println(jieCheng(5));
	}
}
/* 
120
 */