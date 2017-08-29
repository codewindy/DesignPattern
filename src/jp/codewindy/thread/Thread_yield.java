package jp.codewindy.thread;
/**
 * cpu ÀñÈÃ³öÏß³Ì
 * @author yui
 *
 */
public class Thread_yield {
	public static void main(String[] args) {
		new MyThready().start();
		new MyThready().start();
	}
}

class MyThready extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 1000; i++) {
			if(i%10==0)Thread.yield();
				System.out.println(getName()+"........"+i);
			
		}
	}
}
