package test50;
 
/**
 * @author Martin
 *������17��MonkeyEatPeach.java 
 *��Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ�� �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��������10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١� 
 *1.�����������ȡ����˼ά�ķ������Ӻ���ǰ�ƶ�
 */
public class MonkeyEatPeach {
 
    /**
     * ��ȡd��ǰ�ж�������
     * @param d
     * @return
     */
    public static int getNum(int d){
        if(d == 0) return 1;
        else return (getNum(d-1) + 1) * 2;
    }
     
    public static void main(String[] args) {
        System.out.println(getNum(10));
    }
 
}
/* 
3070
 */