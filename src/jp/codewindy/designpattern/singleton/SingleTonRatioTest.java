package jp.codewindy.designpattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试5种单利模式的效率对比
 * 
 * @author yui
 *
 */
public class SingleTonRatioTest {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch cdl = new CountDownLatch(threadNum);
		for (int i = 0; i < threadNum; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					for (int j = 0; j < 100000; j++) {
						//SingleTon_hungry instance = SingleTon_hungry.getInstance();//7
						//SingleTon_lazyLoad.getInstance();//24
						//SingleTon_doubleCheckingLock.getInstance();//10
						//SingleTon_staticNestedClass.getInstance();//20
						SingleTon_enum instance = SingleTon_enum.INSTANCE;//7
					}
					cdl.countDown();
				}
			}).start();
		}
		cdl.await(); //main 方法阻塞 直到计数器变成0,才能继续往下执行
		long end = System.currentTimeMillis();
		System.out.println("总共耗时:  = " + (end - start));

	}

}
