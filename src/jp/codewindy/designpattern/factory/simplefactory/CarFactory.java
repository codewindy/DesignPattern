package jp.codewindy.designpattern.factory.simplefactory;

import jp.codewindy.designpattern.factory.factorymethod.Audi;
import jp.codewindy.designpattern.factory.factorymethod.Car;
import jp.codewindy.designpattern.factory.factorymethod.Lexus;

public class CarFactory {
	public static Car createCar(String CarType) {
		if ("Audi".equals(CarType)) {
			return new Audi();
		} else if ("Lexus".equals(CarType)) {
			return new Lexus();
		} else {
			return null;
		}

	}

}
