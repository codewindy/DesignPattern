package jp.codewindy.thread.safeQ;

public class SellTicket {
	public static void main(String[] args) {
		
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
	}
}

class Ticket extends Thread{
	private static int ticket=100;
	@Override
	public void run() {
		//不能用this  只能用Ticket.class
		synchronized (Ticket.class) {
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
				System.out.println(getName() + "......" + "这是第        " + ticket-- + "      张票");
			}
		}
	}
}