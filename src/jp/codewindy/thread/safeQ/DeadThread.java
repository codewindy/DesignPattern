package jp.codewindy.thread.safeQ;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ��������������
 * @author yui
 *
 */
public class DeadThread {
	private static String s1="������";
	private static String s2="������";
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		
		
		new Thread(){
			@Override
			public void run() {
				while(true){
					synchronized (s1) {
					System.out.println(getName()+"......��ȡ"+s1+"�ȴ�"+s2);
						synchronized (s2) {
							
							System.out.println(getName()+"......�õ�"+s2+"��ʼ�Է� ��.....����.");
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
						System.out.println(getName()+"......��ȡ"+s2+"�ȴ�"+s1);
						synchronized (s1) {
							
							System.out.println(getName()+"......�õ�"+s1+"��ʼ�Է� ��.....����.");
						}
					}
				}
				
			}
		}.start();
		
	}
}
