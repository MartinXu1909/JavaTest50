package test50;

/**
 * @author Martin
 *������27�� SuShu.java
 * ��Ŀ����100֮�ڵ�����
 *1.����������ж������ķ�������һ�����ֱ�ȥ��2~sqrt(n)����2~n/2,����2~n/2��
 *��Ϊһ������һ���ƽ�������䱾���Ǵ�5��ʼ�ģ��ⷽ�̣�n/2��ƽ��>n .����ܱ������� 
 *���������������������֮��������
 */
public class SuShu {

    /**
     * �ж�n�ǲ�������
     * @param n
     * @return
     */
    public static boolean isPrimeNumber(int n){
        
        if(n == 2) return true;
        
        for(int i=2; i<=n/2; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 0;
        for(int i=0; i<=100; i++){
            if(isPrimeNumber(i)){
                n++;
                System.out.print(i + ",");
            }
        }
        System.out.println("\n0-100֮����"+n+"������");
    }
}
/* 
0,1,2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,
0-100֮����27������
 */