package test50;
/**
 * @author Martin
 * ������18�� Prog.java 
 * ��Ŀ������ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ��������������
 * �������Ա����������������a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ������� 
 */
public class Prog {
public static void main(String[] args) {
		String[] team1 = {"a","b","c"};
		String[] team2 = {"x","y","z"};
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(i == 0 && j == 0)//a˵������x��
					continue;
				else if(i == 2 && (j == 0 || j == 2))
					continue;//c˵������x,z��
				else{
					System.out.println(team1[i] + "<-->" + team2[j]);
				}
			}
		}
	}
}
/* 
a<-->y
a<-->z
b<-->x
b<-->y
b<-->z
c<-->y
 */