package jp.codewindy.designpattern.singleton;

import java.lang.reflect.Constructor;

/**
 * 测试懒汉式单例模式的反射 反序列画漏洞 破解单利 枚举无法破解
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
		System.err.println("通过反射破解了单利方式"+(s3 == s4));

	}
}
