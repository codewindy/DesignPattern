package jp.codewindy.designpattern.factory.factorymethod;

public class TestFactoryMethod {
	public static void main(String[] args) {
		AudiFactory audiFactory = new AudiFactory();
		Car audi = audiFactory.createCar();
		audi.run();
		BMWFactory bmwFactory = new BMWFactory();
		Car bmw = bmwFactory.createCar();
		bmw.run();

	}
}
