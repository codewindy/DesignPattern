package jp.codewindy.thread.mutil;

import java.util.concurrent.TimeUnit;

/**
 * Synchronized 的锁是可以重入的
 * 
 * 发生线程 脏读现象 dirty read  需要synchronized 
 * 
 * @author yui 0.0 1000.0
 * 
 */
public class Demo_Account_DirtyRead {
	public static void main(String[] args) {
		final Demo_Account_DirtyRead dadr = new Demo_Account_DirtyRead();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				dadr.set("codewindy", 1000.0);
			}
		}).start();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.err.println(dadr.getBalance("codewindy"));
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(dadr.getBalance("codewindy"));
	}

	String name;
	double balance;

	public synchronized void set(String name, double balance) {
		this.name = name;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.balance = balance;
	}
	/**
	 * 添加synchronized 防止脏读  在金融方面 很重要
	 * @param name
	 * @return
	 */
	public synchronized double getBalance(String name) {
		return this.balance;
	}
}
