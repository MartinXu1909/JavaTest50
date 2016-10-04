package test50;

/**
 * @author VellBibi
 *��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ������Ӷ���Ϊ���٣� 
 *1.��������� ���ӵĹ���Ϊ����1,1,2,3,5,8,13,21...
 */
public class TestRabbit {

    /**
     * @param m ������
     * @return �������Ӷ���
     */
    public static int sumRabbitNumber(int m){
        int n = 1;//��0���¶���
        int e = 0;//��0���¶���
        int cup = 0;
        for(int i=1; i<m; i++){
            cup = n;
            n = e + n;
            e = cup;
        }
        return n;
    }
    
    public static void main(String[] args) {
        
        for(int i=1; i<=10; i++){
            System.out.print(sumRabbitNumber(i)+",");
        }
    }

}
