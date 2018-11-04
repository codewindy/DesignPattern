package jp.codewindy.thread.mutil;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 如果锁定的是static 就不能使用synchronized(this) 使用的是Class 对象字节码对象
 * 
 * @author yui synchronized 的代码 块 是原子操作 不可分割和多线程打断 同步方法和 非同步方法 可以一起执行 不相关
 *         一个同步方法可以调用另外一个同步方法 一个线程已经用户某个对象的锁 再次申请的时候任然会得到该对象的锁
 *         也就是说Synchronized获得的锁是可重入的
 */
public class Demo_synchronized {
	private int count = 10;
	ReentrantLock lock=new ReentrantLock(true);
	

	public synchronized void m() {// 等同玉方法代码执行时要synchronized(this) 锁住的是这个对象
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
