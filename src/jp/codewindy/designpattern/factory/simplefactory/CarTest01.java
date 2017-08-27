package jp.codewindy.designpattern.factory.simplefactory;

import jp.codewindy.designpattern.factory.factorymethod.Audi;
import jp.codewindy.designpattern.factory.factorymethod.Lexus;

/**
 * 简单工厂模式下测试  缺点 不遵循开闭原则,扩展性差
 * 
 * @author yui
 *
 */
public class CarTest01 {
	public static void main(String[] args) {
		Audi audi = new Audi();
		Lexus lexus = new Lexus();
		audi.run();
		lexus.run();

	}

}
