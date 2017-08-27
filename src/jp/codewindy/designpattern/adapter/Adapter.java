package jp.codewindy.designpattern.adapter;

/**
 *   ≈‰qi  ¿‡ºÃ≥–∑Ω Ω
 * 
 * @author yui
 *
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void HandleReq() {
		// TODO Auto-generated method stub
		super.request();

	}

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		Adaptee adaptee = new Adaptee();

		Target t = new Adapter();

		laptop.test(t);
	}

}
