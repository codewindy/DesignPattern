package jp.codewindy.thread;

public class Thread_join {
	public static void main(String[] args) {
		
		final Thread t1=new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++) {
				System.out.println(this.getName()+"aaaaaa");
			}
			}
		};
		Thread t2=new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					if(i==2)
						try {
							//t1.join();//插队执行线程t1 可以设置时间长度
							t1.join(1);
							
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					System.err.println(this.getName()+"bbbbbb");
				}
			}
		};
		t1.start();
		t2.start();
	}
}
