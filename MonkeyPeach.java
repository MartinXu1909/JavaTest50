package test50;
/**
 * @author Martin
 *������41�� MonkeyPeach.java
 *��Ŀ����̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ������ֻ���ӰѶ��һ
 *�����뺣�У�������һ�ݡ��ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣��
 *��������һ�ݣ����������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
 */
public class MonkeyPeach {
/**
	 * ��õ�n�����ӻ�û������ʱ��������
	 * ���һ����������m������
	 * @param n
	 * @param m
	 * @return
	 */
	public static int getNum(int n, int m){
		if(n > 5) return m*4;
		else {
			double ans = getNum(n+1, m) / 4.0 * 5 + 1;
			if(ans%1 != 0.0 || ans == 1){//�жϽ���Ƿ�Ϊ���������߽����Ϊ1
				return 0;
			}else
				return (int)ans;
		}
	}
	
	public static void main(String[] args) {
		int ans = 0;
		for(int i=1; ; i++){
			ans = getNum(1, i);
			if(ans != 0){
				System.out.println("�����һֻ��������" + i + "������ʱ����̲��ԭ�����ӵõ���СֵΪ��");
				System.out.println(ans);
				break;
			}
		}
	}
}
/* 
�����һֻ��������255������ʱ����̲��ԭ�����ӵõ���СֵΪ��
3121
 */