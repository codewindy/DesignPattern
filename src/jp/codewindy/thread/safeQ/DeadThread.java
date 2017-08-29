package jp.codewindy.thread.safeQ;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 发生死锁的问题
 * @author yui
 *
 */
public class DeadThread {
	private static String s1="筷子左";
	private static String s2="筷子右";
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		
		
		new Thread(){
			@Override
			public void run() {
				while(true){
					synchronized (s1) {
					System.out.println(getName()+"......获取"+s1+"等待"+s2);
						synchronized (s2) {
							
							System.out.println(getName()+"......得到"+s2+"开始吃饭 了.....哈哈.");
						}
					}
				}
				
			}
		}.start();
		
		new Thread(){
			@Override
			public void run() {
				while(true){
					synchronized (s2) {
						System.out.println(getName()+"......获取"+s2+"等待"+s1);
						synchronized (s1) {
							
							System.out.println(getName()+"......得到"+s1+"开始吃饭 了.....哈哈.");
						}
					}
				}
				
			}
		}.start();
		
	}
}
