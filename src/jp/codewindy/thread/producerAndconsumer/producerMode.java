package jp.codewindy.thread.producerAndconsumer;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * 面试题 写一个固定容量的同步容器 要有put 和get 方法 以及getCount 方法 能够支持2个生产者线程以及10个消费者线程的阻塞调用
 * 使用wait 和notify /notifyAll 来实现
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
		this.notifyAll(); // 通知消费着进行消费
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
		this.notifyAll();// 通知生产着生成

		return t;

	}

	public static void main(String[] args) {

		producerMode<String> pm = new producerMode<>();
		// 启动消费者线程
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
		// 启动生产者线程
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
