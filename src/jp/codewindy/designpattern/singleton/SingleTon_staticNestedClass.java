package jp.codewindy.designpattern.singleton;
/**
 * 使用静态内部类的方式实现单例模式 推荐  线程安全 懒加载
 * @author yui
 *
 */
public class SingleTon_staticNestedClass {
	private SingleTon_staticNestedClass() {
	};

	private static class SingleTon_InstanceHolder {
		private static final SingleTon_staticNestedClass INSTANCE = new SingleTon_staticNestedClass();
	}

	public static SingleTon_staticNestedClass  getInstance(){
		return SingleTon_InstanceHolder.INSTANCE;
	}

}
