package test50;

/**
 * @author Martin
 *������10��TestBall.java 
 *��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������ڵ�10�����ʱ�������������ף���10�η�����ߣ�
 *1.�������:�ݹ�ʵ��
 */
public class TestBall {

    public static double sumBallHeight(double h, int n){
        if(n == 1) return h/2;
        else return sumBallHeight(h/2, n-1);
    }
    
    public static void main(String[] args) {
        System.out.println(sumBallHeight(100, 10));
    }
}
/* 
0.09765625
 */