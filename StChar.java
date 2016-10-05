package test50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Martin
 *������7�� StChar.java 
 *��Ŀ������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ����� 
 *1.�������������ѭ��,ʹ��Map�洢����.��ʵ��ȫ����ʹ��4�����������,��������Զ��ϰ��Map��
 */
public class StChar {

    public static Map<Integer, Integer> countChar(String str){
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(1, 0);
        m.put(2, 0);
        m.put(3, 0);
        m.put(4, 0);
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z')
                m.put(1, m.get(1) + 1);
            else if(ch[i] == ' ')
                m.put(2, m.get(2) + 1);
            else if(ch[i] >= '0' && ch[i] <= '9')
                m.put(3, m.get(3) + 1);
            else
                m.put(4, m.get(4) + 1);
        }
        return m;
    }
    
    public static void main(String[] args) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(
                System.in));
        String str = null;
        try {
            str = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Map<Integer, Integer> m = countChar(str);
        Set<Integer> keys = m.keySet();
        Iterator<Integer> it = keys.iterator();
        int n, k;
        while(it.hasNext()){
            k = it.next();
            n = m.get(k);
            switch (k) {
            case 1:
                System.out.println("Ӣ����ĸ: "+n);
                break;
            case 2:
                System.out.println("�ո�: "+n);
                break;
            case 3:
                System.out.println("����: "+n);
                break;
            case 4:
                System.out.println("�����ַ�: "+n);
                break;

            default:
                break;
            }
        }
    }
}
/* 
V&View well001 Martin;
Ӣ����ĸ: 15
�ո�: 2
����: 3
�����ַ�: 2

 */