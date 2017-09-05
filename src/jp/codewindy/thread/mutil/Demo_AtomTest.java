package jp.codewindy.thread.mutil;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * count++ 不是原子操作,线程不安全
 * 
 * @author yui
 *
 */
public class Demo_AtomTest {
	// volatile int count=0;

	AtomicInteger count = new AtomicInteger(0);

	/*synchronized*/void m() {
		for (int i = 0; i < 10000; i++) {
			count.incrementAndGet(); //替代count++ 的具备原子性

		}
	}

	public static void main(String[] args) {
		final Demo_AtomTest dat = new Demo_AtomTest();
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) {
			threads.add(new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					dat.m();
				}
			}));
			
		}
	}
}
