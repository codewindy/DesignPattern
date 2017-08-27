package jp.codewindy.designpattern;

/**
 * ˫�ؼ����ģʽʵ�ֵ���ģʽ ���ڱ�������jvm �ڴ�ģ�Ͳ�֧�� ������
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
