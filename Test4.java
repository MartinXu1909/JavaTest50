package test50;
/**
 * @author Martin
 *������42�� Test4.java
 *��Ŀ��809*??=800*??+9*??
 *����??�������λ��,8*??�Ľ��Ϊ��λ����9*??�Ľ��Ϊ3λ������??�������λ������809*??��Ľ���� 
 */
public class Test4 {
	public static void main(String[] args) {
		for(int i=10; i<100 && 8*i<100 && 9*i<1000; i++){
			if(809*i == (800*i + 9*i)){
				System.out.println("??�������λ��:" + i);
				System.out.println("809*??��Ľ��" + i*809);
				return;
			}
		}
		System.out.println("û�з��ϵ���");
	}
}
/* 
û�з��ϵ���

??�������λ��:10
809*??��Ľ��8090
 */