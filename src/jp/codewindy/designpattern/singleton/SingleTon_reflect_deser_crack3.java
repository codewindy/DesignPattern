package jp.codewindy.designpattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ��������ʽ����ģʽ�ķ��� �����л�©�� �ƽⵥ�� ö���޷��ƽ�
 * �����ڹ��췽������� �ж�����е���instance ������ֱ���׳��쳣,ʵ�ְ�ȫ����
 *  ͨ�������л��ķ�ʽ�ƽⵥ��ģʽ
 * @author yui
 *
 */
public class SingleTon_reflect_deser_crack3 {

	public static void main(String[] args) throws Exception {
		SingleTon_lazyLoad s1 = SingleTon_lazyLoad.getInstance();
		SingleTon_lazyLoad s2 = SingleTon_lazyLoad.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2==s1);
		
		//ͨ�������л���ʽ����������� �ƽⵥ��ģʽ
		FileOutputStream fos = new FileOutputStream(new File("E:/singleTon.txt"));
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/singleTon.txt"));
		SingleTon_lazyLoad s_deser = (SingleTon_lazyLoad) ois.readObject();
		System.err.println("�����л�֮������һ�� ,��Ҫ�ڵ��������ObjectResolve����= "+s_deser);
		System.err.println(s_deser==s1);
		 
		
		
		


	}
}
