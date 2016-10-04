package test50;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Martin
 * ������4��Explode.java 
 *��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5�� 
 *�����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ� 
 *(1)��������ѭ��
 *(2)��ѭ���õ�2~n֮���������������ѭ����nѭ������������֪����������
 *(3)Ҫ����ѭ��n����1�˾�˵��n����ȫ������
 */
public class Explode {
    
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
        BufferedReader buffer = new BufferedReader(new InputStreamReader(
                System.in));
        int N = 0;
        try {
            N = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(N+"=");
        for(int i=2; i<N; i++){
            if(!isPrimeNumber(i)) continue;
            while(N%i == 0){
                System.out.print(i);
                N = N/i;
                if(N != 1) System.out.print("*");
                else break;
            }
        }
        if(N != 1) System.out.println(N);
    }

}
/* 
90
90=2*3*3*5
 */