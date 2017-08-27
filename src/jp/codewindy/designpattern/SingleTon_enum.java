package jp.codewindy.designpattern;
/**
 * 枚举方式实现 ,本身就是单例的jvm 原生支持的方式
 * 防止了反射 反序列的安全问题
 * 没有延迟加载的特性
 * @author yui
 *
 */
public enum SingleTon_enum {
	INSTANCE;
	//添加自己需要的操作
	public void singletonMethod(){
		
	}
	
}
