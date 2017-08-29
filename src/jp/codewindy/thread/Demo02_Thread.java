package jp.codewindy.thread;

/**
 * 1 继承Thread 2 重写run方法 3. 将要执行的代码写在run方法中
 * 
 * @author yui
 *
 */
public class Demo02_Thread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.run(); //不会开启新的线程
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