package test50;
/**
 * @author Martin
 *������42�� Test4_1.java
 *��Ŀ��809*??=800*??+9*??
 *����??�������λ��,8*??�Ľ��Ϊ��λ����9*??�Ľ��Ϊ3λ������??�������λ������809*??��Ľ���� 
 * //��Ŀ���ˣ�809x=800x+9x+1�����ķ����޽⡣ȥ���Ǹ�1���н��ˡ�
 */
public class Test4_1 {
public static void main(String[] args) {
		for(int i=10; i<100; i++){
			for(int j=10; j<100 && 8*j<100; j++){
				for(int l=10; l<100 && 9*l<1000; l++){
					if(809*i == 800*j + 9*l){
						System.out.println("809*"+i+" == 800*"+j+"+ 9*"+l);
						System.out.println("809*??��Ľ��" + i*809);
						return;
					}
				}
			}
		}
		System.out.println("û�з��ϵ���");
	}
}
/* 
û�з��ϵ���
 */