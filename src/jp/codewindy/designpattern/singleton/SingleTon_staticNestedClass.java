package jp.codewindy.designpattern.singleton;
/**
 * ʹ�þ�̬�ڲ���ķ�ʽʵ�ֵ���ģʽ �Ƽ�  �̰߳�ȫ ������
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
