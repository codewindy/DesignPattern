package jp.codewindy.thread;

public class Thread_sleep2 {
	public static void main(String[] args) {

	Thread t1=new Thread(){
		public void run() {
			for (int i = 0; i < 2; i++) {
				System.out.println("aaaaaaaa");
			}
		}
	};
		
	Thread t2=new Thread(){
		public void run() {
			for (int i = 0; i < 200; i++) {
				System.err.println("bbbbbbbbbbb");
			}
		}
	};
	t2.setDaemon(true);
	t1.start();
	t2.start();
	}
}
