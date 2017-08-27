package jp.codewindy.designpattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ��������ʽ���� ���ʼ����ʱ�򲻳�ʼ��������� ��ʱ���� ����ʹ�õ�ʱ����� ��Ҫ���synchronized ʵ���̰߳�ȫ
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
	//�����л�ʱ�� ���������readResolve ���� ��ֱ�ӷ��ش˷���ָ���Ķ���,����ȥ���������¶���
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
