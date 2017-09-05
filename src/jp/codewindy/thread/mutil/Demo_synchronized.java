package jp.codewindy.thread.mutil;
/**
 * 如果锁定的是static 就不能使用synchronized(this) 使用的是Class 对象字节码对象
 * @author yui  synchronized 的代码 块 是原子操作 不可分割和多线程打断
 *  同步方法和 非同步方法 可以一起执行 不相关
 */
public class Demo_synchronized {
	private int count = 10;

	public synchronized void m() {// 等同玉方法代码执行时要synchronized(this) 锁住的是这个对象
		count--;
		System.out.println(Thread.currentThread().getName() + "count=" + count);
	}

}
