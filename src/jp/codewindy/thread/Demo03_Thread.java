package jp.codewindy.thread;

public class Demo03_Thread {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		new Thread(mr).start();
		for (int i = 0; i < 10000; i++) {
			System.out.println("bbbbbbbbbÏß³Ì..........");
		}
	}

}

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.err.println("aaaaaaaaa");
		}
	}
}
