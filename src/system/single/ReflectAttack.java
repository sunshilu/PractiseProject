package system.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class ReflectAttack {
	public static void main(String[] args) throws Exception {
		reflectionAttack();
		serializationAttack();
	}

//破坏单例模式的方法
//1.反射攻击（只能在单例的构造方法里检测instance是否为null）（双检锁无法防御，静态内部类可以，枚举可以）
	private static void reflectionAttack() throws Exception {
// 		1.获取无参的构造方法
		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//		2.取消权限检测机制
		constructor.setAccessible(true);
//		3.创建两个单例对象
		Singleton s1 = constructor.newInstance();
		Singleton s2 = constructor.newInstance();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1 == s2);
	}

//	2.反序列化攻击
	private static void serializationAttack() throws Exception {
		// 创建序列化流对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serFile.ser"));
		// 获取单例对象
		SingletonSerialization s1 = SingletonSerialization.getInstance();
		// 序列化单例对象
		oos.writeObject(s1);

		// 创建反序列化对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("serFile.ser")));
		// 读取反序列化对象
		SingletonSerialization s2 = (SingletonSerialization) ois.readObject();

		System.out.println(s1 == s2);
	}

}
