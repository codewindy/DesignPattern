package jp.codewindy.designpattern.factory.simplefactory;

import jp.codewindy.designpattern.factory.factorymethod.Audi;
import jp.codewindy.designpattern.factory.factorymethod.Lexus;

/**
 * �򵥹���ģʽ�²���  ȱ�� ����ѭ����ԭ��,��չ�Բ�
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
