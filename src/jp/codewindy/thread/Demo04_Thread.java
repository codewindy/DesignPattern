package jp.codewindy.thread;
/**
 * 使用 匿名内部类的方式实现  给线程设置名称
 * @author yui
 *
 */
public class Demo04_Thread {
	public static void main(String[] args) {
		
		new Thread("线程学习一"){
			public void run(){
				for (int i = 0; i < 1000; i++) {
					this.setName("线程学习一备覆盖了...");
					System.out.println(this.getName()+"=================aaaaaaaa......");
				}
			}
		}.start();
		
		new Thread("线程学习2"){
			public void run(){
				for (int i = 0; i < 1000; i++) {
					System.out.println(this.getName()+"===============CCCCCCCCCCC......");
				}
			}
		}.start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("我是假的主线程...");
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					System.err.println(Thread.currentThread().getName()+"bbbbbbbbbbbbb......");
				}
			}
		}).start();
	}
}
