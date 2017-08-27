package jp.codewindy.designpattern.factory.simplefactory;

import jp.codewindy.designpattern.factory.factorymethod.Audi;
import jp.codewindy.designpattern.factory.factorymethod.Car;
import jp.codewindy.designpattern.factory.factorymethod.Lexus;

public class CarFactory2 {
	public static Car createAudi() {
		return new Audi();
	}

	public static Car createLexus() {
		return new Lexus();
	}

}
