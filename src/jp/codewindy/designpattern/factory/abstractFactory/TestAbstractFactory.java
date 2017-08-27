package jp.codewindy.designpattern.factory.abstractFactory;

public class TestAbstractFactory {
	public static void main(String[] args) {
		LuxuryCarFactory lf = new LuxuryCarFactory();
		Engine e = lf.createEngine();
		Seat c = lf.createSeat();
		c.massage();

		e.start();
		e.run();

	}
}
