package jp.codewindy.thread;

/**
 * 1 �̳�Thread 2 ��дrun���� 3. ��Ҫִ�еĴ���д��run������
 * 
 * @author yui
 *
 */
public class Demo02_Thread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.run(); //���Ὺ���µ��߳�
		mt.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("bbbb....");

		}

	}

}

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.err.println("aaaaaaaaa");

		}
	}
}