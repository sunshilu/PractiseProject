package system.single;

//6. 枚举实现单例最佳方法，更简洁，自动支持序列化机制，绝对防止多次实例化，避免多线程同步问题
public enum SingletonEnum {
	INSTANCE;

	public void whateverMethod() {

	}
}
