package test50;
/**
 * @author Martin
 *������41�� MonkeyPeach_1.java
 *��Ŀ����̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ������ֻ���ӰѶ��һ
 *�����뺣�У�������һ�ݡ��ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣��
 *��������һ�ݣ����������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
 *1.�����������ȡֱ����֤����ķ�ʽ
 */
public class MonkeyPeach_1 {
public static boolean isRight(int n) {
		for(int i=0; i<5; i++) {
			if(n % 5 == 1) {
				n = n - 1;
				n = n - n / 5;
			}else
				return false;
		}
		return true;
	}
public static void main(String[] args) {
		for(int n=1; ; n++) {
			if(isRight(n)) {
				System.out.println("��̲��ԭ�����ӵõ���СֵΪ��" + n);
				return;
			}
		}
	}
}
/* 
��̲��ԭ�����ӵõ���СֵΪ��3121
 */