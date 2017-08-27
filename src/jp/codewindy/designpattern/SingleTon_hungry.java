package jp.codewindy.designpattern;

/**
 * 测试懒汉式单例模式 类初始化时候 立即加载这个对象 没有延迟加载的优势 加载时候天然的线程安全
 * 
 * @author yui
 *
 */
public class SingleTon_hungry {

	private SingleTon_hungry() {if(instance!=null) throw new RuntimeException();};

	private static SingleTon_hungry instance = new SingleTon_hungry();

	public static SingleTon_hungry getInstance() {
		return instance;
	}

}
