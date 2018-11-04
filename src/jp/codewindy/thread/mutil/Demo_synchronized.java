package jp.codewindy.thread.mutil;

import java.util.concurrent.locks.ReentrantLock;

/**
 * �����������static �Ͳ���ʹ��synchronized(this) ʹ�õ���Class �����ֽ������
 * 
 * @author yui synchronized �Ĵ��� �� ��ԭ�Ӳ��� ���ɷָ�Ͷ��̴߳�� ͬ�������� ��ͬ������ ����һ��ִ�� �����
 *         һ��ͬ���������Ե�������һ��ͬ������ һ���߳��Ѿ��û�ĳ��������� �ٴ������ʱ����Ȼ��õ��ö������
 *         Ҳ����˵Synchronized��õ����ǿ������
 */
public class Demo_synchronized {
	private int count = 10;
	ReentrantLock lock=new ReentrantLock(true);
	

	public synchronized void m() {// ��ͬ�񷽷�����ִ��ʱҪsynchronized(this) ��ס�����������
		count--;
		try {
			lock.lockInterruptibly();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "count=" + count);
	}

}
