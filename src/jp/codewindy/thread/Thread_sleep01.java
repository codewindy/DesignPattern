package jp.codewindy.thread;

public class Thread_sleep01 {
	public static void main(String[] args) {

		new Thread(new Runnable() {
	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < 20; i++) {
					System.out.println("�ػ��߳�  ����   =  ˧.....");
				}

			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// TODO Auto-generated method stub
				for (int i = 0; i < 20; i++) {
					System.err.println("�ػ��߳�  ����  �����ػ��߳�.....");
				}
				
			}
		}).start();

		
	}
}
