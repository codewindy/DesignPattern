package jp.codewindy.designpattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式加载 类初始化的时候不初始化这个对象 延时加载 真正使用的时候加载 需要添加synchronized 实现线程安全
 * 
 * @author yui
 *
 */
public class SingleTon_lazyLoad implements Serializable {
	//private static final long serialVersionUID = 1L;

	private SingleTon_lazyLoad() {
		if (instance != null) {
			throw new RuntimeException();
		}
	};
	//反序列化时候 如果定义了readResolve 方法 则直接返回此方法指定的对象,而不去单独创建新对象
	private Object readResolve()  throws ObjectStreamException{
		return instance;
	}

	private static SingleTon_lazyLoad instance = null;

	public static synchronized SingleTon_lazyLoad getInstance() {
		if (instance == null) {
			instance = new SingleTon_lazyLoad();
		}
		return instance;
	}
}
