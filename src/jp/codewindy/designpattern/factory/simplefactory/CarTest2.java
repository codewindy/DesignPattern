package jp.codewindy.designpattern.factory.simplefactory;

import jp.codewindy.designpattern.factory.factorymethod.Car;

/**
 * 简单工厂模式下测试
 * 
 * @author yui
 *
 */
public class CarTest2 {
	public static void main(String[] args) {
		//factoryTest01();
		Car audi = CarFactory2.createAudi();
		audi.run();
		Car lexus = CarFactory2.createLexus();
		lexus.run();
	}

	private static void factoryTest01() {
		Car audi = CarFactory.createCar("Audi");
		Car lexus = CarFactory.createCar("Lexus");
		audi.run();
		lexus.run();
	}

}
