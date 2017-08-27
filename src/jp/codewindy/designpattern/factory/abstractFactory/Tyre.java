package jp.codewindy.designpattern.factory.abstractFactory;

public interface Tyre {
	void revolve();
}

class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("¸ßµµÂÖÌ¥........");
	}
	
}
class LowTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("lowBÂÖÌ¥........");
		// TODO Auto-generated method stub
		
	}
	
}