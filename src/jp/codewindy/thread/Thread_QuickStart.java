package jp.codewindy.thread;

/**
 * 多线程并发执行可以提高程序的效率 同时完成多项工作 证明jvm 是多线程的
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
			System.err.println("我是主线程执行了............");
		}

		
	}
}

class Demo {

	@Override
	protected void finalize() throws Throwable {
	
		System.out.println("垃圾被清除了***********************");
	}

}
