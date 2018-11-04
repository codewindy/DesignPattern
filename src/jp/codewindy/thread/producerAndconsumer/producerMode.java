package jp.codewindy.thread.producerAndconsumer;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * ������ дһ���̶�������ͬ������ Ҫ��put ��get ���� �Լ�getCount ���� �ܹ�֧��2���������߳��Լ�10���������̵߳���������
 * ʹ��wait ��notify /notifyAll ��ʵ��
 * 
 * @author yui
 * @param <T>
 *
 */
public class producerMode<T> {
	final private LinkedList<T> lists = new LinkedList<T>();
	final private int MAX = 10;
	private int count = 0;

	public synchronized void put(T t) {
		while (lists.size() == MAX) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // effective java

		}
		lists.add(t);
		++count;
		this.notifyAll(); // ֪ͨ�����Ž�������
	}

	public synchronized T get() {
		T t = null;
		while (lists.size() == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		t = lists.removeFirst();

		count--;
		this.notifyAll();// ֪ͨ����������

		return t;

	}

	public static void main(String[] args) {

		producerMode<String> pm = new producerMode<>();
		// �����������߳�
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				for (int j = 0; j < 5; j++) {
					System.err.println(pm.get());
				}

			}, "c" + i).start();

		}

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// �����������߳�
		for (int i = 0; i < 2; i++) {
			new Thread(()->{
				for (int j = 0; j < 25; j++) {
					pm.put(Thread.currentThread().getName()+"   " +j);
				}
				
			},"p"+i
					
			).start();
		}

	}

}
