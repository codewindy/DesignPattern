package jp.codewindy.designpattern.adapter;

/**
 * 适配qi  组合方式
 * 
 * @author yui
 *
 */
public class Adapter2 extends Adaptee implements Target {
	
	private Adaptee adaptee;
	
	
	@Override
	public void HandleReq() {
		// TODO Auto-generated method stub
		super.request();

	}

	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		Adaptee adaptee = new Adaptee();

		Target t = new Adapter2(adaptee);

		laptop.test(t);
	}

}
