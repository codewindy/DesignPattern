package jp.codewindy.thread.mutil;
/**
 * �����������static �Ͳ���ʹ��synchronized(this) ʹ�õ���Class �����ֽ������
 * @author yui  synchronized �Ĵ��� �� ��ԭ�Ӳ��� ���ɷָ�Ͷ��̴߳��
 *  ͬ�������� ��ͬ������ ����һ��ִ�� �����
 */
public class Demo_synchronized {
	private int count = 10;

	public synchronized void m() {// ��ͬ�񷽷�����ִ��ʱҪsynchronized(this) ��ס�����������
		count--;
		System.out.println(Thread.currentThread().getName() + "count=" + count);
	}

}
