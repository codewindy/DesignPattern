package jp.codewindy.designpattern.factory.abstractFactory;

public interface Engine {
	void run();

	void start();

}
class LuxuryEngine implements Engine{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ܵĿ�.......");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("�Զ���ͣ......Ѳ��..");
	}
	
}
class LowEngine implements Engine{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ܵ���.......");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("���׳����¹�...");
	}
	
}
