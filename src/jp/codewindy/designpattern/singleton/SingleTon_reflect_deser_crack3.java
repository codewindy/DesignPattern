package jp.codewindy.designpattern.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试懒汉式单例模式的反射 反序列画漏洞 破解单利 枚举无法破解
 * 可以在构造方法中添加 判断如果有单利instance 存在则直接抛出异常,实现安全控制
 *  通过反序列化的方式破解单利模式
 * @author yui
 *
 */
public class SingleTon_reflect_deser_crack3 {

	public static void main(String[] args) throws Exception {
		SingleTon_lazyLoad s1 = SingleTon_lazyLoad.getInstance();
		SingleTon_lazyLoad s2 = SingleTon_lazyLoad.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2==s1);
		
		//通过反序列化方式创建多个对象 破解单利模式
		FileOutputStream fos = new FileOutputStream(new File("E:/singleTon.txt"));
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/singleTon.txt"));
		SingleTon_lazyLoad s_deser = (SingleTon_lazyLoad) ois.readObject();
		System.err.println("反序列化之后结果不一致 ,需要在单例中添加ObjectResolve方法= "+s_deser);
		System.err.println(s_deser==s1);
		 
		
		
		


	}
}
