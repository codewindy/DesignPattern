package jp.codewindy.designpattern;

/**
 * ��������ʽ����ģʽ ���ʼ��ʱ�� ��������������� û���ӳټ��ص����� ����ʱ����Ȼ���̰߳�ȫ
 * 
 * @author yui
 *
 */
public class SingleTon_hungry {

	private SingleTon_hungry() {if(instance!=null) throw new RuntimeException();};

	private static SingleTon_hungry instance = new SingleTon_hungry();

	public static SingleTon_hungry getInstance() {
		return instance;
	}

}
