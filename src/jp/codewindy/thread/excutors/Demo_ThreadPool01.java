package jp.codewindy.thread.excutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo_ThreadPool01 {
	public static final Integer TASK_MAX=7; //定义任务的大小
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService pool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < TASK_MAX; i++) {
			pool.execute(()->{
				try {
					TimeUnit.MILLISECONDS.sleep(500);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.err.println(Thread.currentThread().getName());
			});
		}
		
		System.err.println(pool);
		pool.shutdown();
		System.err.println(pool.isTerminated());
		System.err.println(pool.isShutdown());
		System.err.println(pool);
		TimeUnit.SECONDS.sleep(5);
		
		System.err.println(pool.isTerminated());
		System.err.println(pool.isShutdown());
		System.err.println(pool);
	}
	

}
