package jp.codewindy.thread;

/**
 * ���̲߳���ִ�п�����߳����Ч�� ͬʱ��ɶ���� ֤��jvm �Ƕ��̵߳�
 * 
 * @author yui
 *
 */
public class Thread_QuickStart {
	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			new Demo();
		}
		for (int i = 0; i < 100000; i++) {
			System.err.println("�������߳�ִ����............");
		}

		
	}
}

class Demo {

	@Override
	protected void finalize() throws Throwable {
	
		System.out.println("�����������***********************");
	}

}
