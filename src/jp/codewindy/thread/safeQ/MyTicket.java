package jp.codewindy.thread.safeQ;
/**
 * �������һ���߳��� �Ƿ���,�߳̽���ִ�к�������������
 * @author yui
 *
 */
public class MyTicket {
	public static void main(String[] args) {
		Ticketable tt=new Ticketable();
		/*new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();*/
		Thread t1 = new Thread(tt);
		t1.start();
		t1.start();
		t1.start();
		t1.start();
	}

}

class Ticketable implements Runnable{
	
	private int ticket=100;
	@Override
	public void run() {
		//������this  ֻ����Ticket.class
		synchronized (Ticketable.class) {
			// TODO Auto-generated method stub
			while (true) {
				if (ticket <= 0) {
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ",�߳���......" + "���ǵ�        " + ticket-- + "      ��Ʊ");
			}
		}
	}
	
}