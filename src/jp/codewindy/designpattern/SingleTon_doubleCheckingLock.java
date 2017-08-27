package jp.codewindy.designpattern;

/**
 * 双重检测锁模式实现单例模式 由于编译器和jvm 内存模型不支持 不建议
 * 
 * @author yui
 *
 */
public class SingleTon_doubleCheckingLock {

	private SingleTon_doubleCheckingLock() {
	};

	private static volatile SingleTon_doubleCheckingLock instance = null;

	public static SingleTon_doubleCheckingLock getInstance() {
		if (instance == null) {
			synchronized (SingleTon_doubleCheckingLock.class) {
				if (instance == null) {
					instance = new SingleTon_doubleCheckingLock();
				}
			}
		}
		return instance;
	}
}
