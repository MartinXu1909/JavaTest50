package test50;
/**
 * @author Martin
 *������23��TestAge.java
 *��Ŀ����5��������һ���ʵ�����˶����ꣿ��˵�ȵ�4���˴�2�ꡣ�ʵ�4������������˵�ȵ�3���˴�2�ꡣ
 *�ʵ������ˣ���˵�ȵ�2�˴����ꡣ�ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ����ʵ�һ���ˣ���˵��10�ꡣ���ʵ�����˶��
 *1.������������õݹ�ķ������ݹ��Ϊ���ƺ͵��������׶Ρ�Ҫ��֪�����������������֪�������˵�����,�������ƣ��Ƶ���һ�ˣ�10�꣩���������ơ�
 */
public class TestAge {
/**
	 * ��ȡ��n���˵�����
	 * @param n
	 * @return
	 */
	public static int getAge(int n){
		if(n == 1) return 10;
		else return getAge(n-1) + 2;
	}
	
	public static void main(String[] args) {
		System.out.println(getAge(5));
	}
}
/* 
18
 */