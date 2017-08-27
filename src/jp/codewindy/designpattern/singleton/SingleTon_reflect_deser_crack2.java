package jp.codewindy.designpattern.singleton;

import java.lang.reflect.Constructor;

/**
 * ��������ʽ����ģʽ�ķ��� �����л�©�� �ƽⵥ�� ö���޷��ƽ�
 * �����ڹ��췽������� �ж�����е���instance ������ֱ���׳��쳣,ʵ�ְ�ȫ����
 * 
 * @author yui
 *
 */
public class SingleTon_reflect_deser_crack2 {

	public static void main(String[] args) throws Exception {
		SingleTon_lazyLoad s1 = SingleTon_lazyLoad.getInstance();
		SingleTon_lazyLoad s2 = SingleTon_lazyLoad.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2==s1);

		Class<SingleTon_lazyLoad> clazz = (Class<SingleTon_lazyLoad>) Class.forName("jp.codewindy.designpattern.SingleTon_lazyLoad");
//ͨ������ķ�ʽ ֱ�ӵ���˽�л������� �ƽⵥ��
		Constructor<SingleTon_lazyLoad> c = clazz.getDeclaredConstructor(null);
		c.setAccessible(true);
		SingleTon_lazyLoad s3 = c.newInstance();
		SingleTon_lazyLoad s4 = c.newInstance();
		System.err.println("ͨ�������ƽ��˵�����ʽ: ="+(s3 == s4));

	}
}
