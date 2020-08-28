package system.single;

import java.io.Serializable;

public class SingletonSerialization implements Serializable {
//	每次反序列化一个序列化的对象实例时都会创建一个新的实例，破坏单例
//	解决方法，在实例上加上transient（短暂的）修饰符，使其不会被序列化
//	添加readResolve()方法，反序列化时，直接从此方法返回对象
	private volatile static transient SingletonSerialization instance;

	private SingletonSerialization() {

	}

	public static SingletonSerialization getInstance() {
		if (instance == null) {
			synchronized (SingletonSerialization.class) {
				if (instance == null) {
					instance = new SingletonSerialization();
				}
			}
		}
		return instance;
	}

	private Object readResolve() {
		return instance;
	}

}
