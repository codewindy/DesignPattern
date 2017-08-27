package jp.codewindy.designpattern.singleton;

import java.lang.reflect.Constructor;

/**
 * ��������ʽ����ģʽ�ķ��� �����л�©�� �ƽⵥ�� ö���޷��ƽ�
 * 
 * @author yui
 *
 */
public class SingleTon_reflect_deser_crack {

	public static void main(String[] args) throws Exception {
		SingleTon_staticNestedClass s1 = SingleTon_staticNestedClass.getInstance();
		SingleTon_staticNestedClass s2 = SingleTon_staticNestedClass.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2==s1);

		Class<SingleTon_staticNestedClass> clazz = (Class<SingleTon_staticNestedClass>) Class.forName("jp.codewindy.designpattern.SingleTon_staticNestedClass");

		Constructor<SingleTon_staticNestedClass> c = clazz.getDeclaredConstructor(null);
		c.setAccessible(true);
		SingleTon_staticNestedClass s3 = c.newInstance();
		SingleTon_staticNestedClass s4 = c.newInstance();
		System.err.println("ͨ�������ƽ��˵�����ʽ"+(s3 == s4));

	}
}
