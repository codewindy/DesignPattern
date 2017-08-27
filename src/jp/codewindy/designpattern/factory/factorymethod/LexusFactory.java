package jp.codewindy.designpattern.factory.factorymethod;

public class LexusFactory implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Lexus();
	}

}
