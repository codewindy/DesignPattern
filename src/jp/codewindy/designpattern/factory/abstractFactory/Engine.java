package jp.codewindy.designpattern.factory.abstractFactory;

public interface Engine {
	void run();

	void start();

}
class LuxuryEngine implements Engine{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("跑的快.......");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("自动起停......巡航..");
	}
	
}
class LowEngine implements Engine{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("跑的慢.......");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("容易出现事故...");
	}
	
}
