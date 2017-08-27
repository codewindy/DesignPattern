package jp.codewindy.designpattern.factory.factorymethod;

public class AudiFactory implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}
