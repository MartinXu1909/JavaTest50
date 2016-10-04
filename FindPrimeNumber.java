package test50;

/**
 * @author Martin
 *��Ŀ���ж�101-200֮���ж��ٸ����������������������
 *1.����������ж������ķ�������һ�����ֱ�ȥ��2~sqrt(n)����2~n/2,����2~n/2��
 *��Ϊһ������һ���ƽ�������䱾���Ǵ�5��ʼ�ģ��ⷽ�̣�n/2��ƽ��>n .����ܱ������� 
 *���������������������֮��������
 */
public class FindPrimeNumber {

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
        for(int i=101; i<=200; i++){
            if(isPrimeNumber(i)){
                n++;
                System.out.print(i + ",");
            }
        }
        System.out.println("\n101-200֮����"+n+"������");
    }
}
/* 
101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,
101-200֮����21������
 */