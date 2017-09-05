package jp.codewindy.jobsearch;

/**
 * 1110100 1001110
 * 
 * 1000100 68 1000011 67 1 0111101 -67 0 1000010 66转换成 1000010 66 1000100 68
 * 1000110 70
 * 
 * @author yui 考的是基础 位运算
 *
 */
public class Test {
	public static void main(String[] args) {
		int a = -67, b = 116, c = 78;
		System.out.println(b & c);
		System.out.println(~a);
		int d = ~a | b & c;
		System.out.println(d);
		System.out.println(68 | 66);

	}

}
