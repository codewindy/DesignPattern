package jp.codewindy.designpattern.factory.abstractFactory;

public interface Tyre {
	void revolve();
}

class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("�ߵ���̥........");
	}
	
}
class LowTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("lowB��̥........");
		// TODO Auto-generated method stub
		
	}
	
}