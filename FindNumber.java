package test50;
 
/**
 * @author Martin
 *������13��FindNumber.java
 *��Ŀ��һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣� 
 *1.�����������10�������жϣ��Ƚ���������100���ٿ������ٽ���������268���ٿ��������������Ľ�������������������ǽ�����뿴���������
 */
public class FindNumber {
 
    public static void main(String[] args) {
        for(int i=1; i<100000; i++){
            if(Math.sqrt(i + 100) % 1 == 0 && Math.sqrt(i + 268) % 1 == 0){
                System.out.println(i);
//              break;
            }
        }
    }
}
/* 
21
261
1581
 */