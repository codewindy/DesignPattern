package jp.codewindy.thread;
/**
 * ʹ�� �����ڲ���ķ�ʽʵ��  ���߳���������
 * @author yui
 *
 */
public class Demo04_Thread {
	public static void main(String[] args) {
		
		new Thread("�߳�ѧϰһ"){
			public void run(){
				for (int i = 0; i < 1000; i++) {
					this.setName("�߳�ѧϰһ��������...");
					System.out.println(this.getName()+"=================aaaaaaaa......");
				}
			}
		}.start();
		
		new Thread("�߳�ѧϰ2"){
			public void run(){
				for (int i = 0; i < 1000; i++) {
					System.out.println(this.getName()+"===============CCCCCCCCCCC......");
				}
			}
		}.start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("���Ǽٵ����߳�...");
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					System.err.println(Thread.currentThread().getName()+"bbbbbbbbbbbbb......");
				}
			}
		}).start();
	}
}
