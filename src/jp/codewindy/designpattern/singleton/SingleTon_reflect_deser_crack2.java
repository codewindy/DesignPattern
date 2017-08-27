package jp.codewindy.designpattern.singleton;

import java.lang.reflect.Constructor;

/**
 * 测试懒汉式单例模式的反射 反序列画漏洞 破解单利 枚举无法破解
 * 可以在构造方法中添加 判断如果有单利instance 存在则直接抛出异常,实现安全控制
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
//通过反射的方式 直接调用私有化构造器 破解单利
		Constructor<SingleTon_lazyLoad> c = clazz.getDeclaredConstructor(null);
		c.setAccessible(true);
		SingleTon_lazyLoad s3 = c.newInstance();
		SingleTon_lazyLoad s4 = c.newInstance();
		System.err.println("通过反射破解了单利方式: ="+(s3 == s4));

	}
}
