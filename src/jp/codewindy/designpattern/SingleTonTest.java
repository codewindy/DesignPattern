package jp.codewindy.designpattern;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 测试单利模式
 * 
 * @author yui
 *
 */
public class SingleTonTest {

	@Test
	public void test() {
		SingleTon_hungry ih = SingleTon_hungry.getInstance();
		SingleTon_hungry ih2 = SingleTon_hungry.getInstance();
		SingleTon_lazyLoad il = SingleTon_lazyLoad.getInstance();
		SingleTon_lazyLoad il2 = SingleTon_lazyLoad.getInstance();
		SingleTon_doubleCheckingLock isdc = SingleTon_doubleCheckingLock.getInstance();
		SingleTon_doubleCheckingLock isdc2 = SingleTon_doubleCheckingLock.getInstance();
		SingleTon_staticNestedClass issnc = SingleTon_staticNestedClass.getInstance();
		SingleTon_staticNestedClass issnc2 = SingleTon_staticNestedClass.getInstance();
		SingleTon_enum ie = SingleTon_enum.INSTANCE;
		SingleTon_enum ie2 = SingleTon_enum.INSTANCE;
		System.out.println("--------单例测试饿汉式----------------");
		System.out.println(ih == ih2);
		System.out.println("--------单例测懒汉式----------------");
		System.err.println(il ==il2);
		System.out.println("--------单例双重锁式----------------");
		System.out.println(isdc == isdc2);
		System.out.println("--------单例静态内部类式----------------");
		System.err.println(issnc == issnc2);
		System.out.println("--------单例枚举式----------------");
		System.out.println(ie == ie2);

	}

}
