package system.single;

import java.io.Serializable;

//单例模式的6种实现
public class Singleton {
//1、懒汉式，线程不安全，不支持多线程
//	private static Singleton instance;
//
//	private Singleton() {
//
//	}
//
//	public static Singleton getInstance() {
//		if (instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
//2.懒汉式，线程安全synchronized，第一次调用时初始化，加锁影响效率
//	private static Singleton instance;
//
//	private Singleton() {
//
//	}
//
//	public static synchronized Singleton getInstance() {
//		if (instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}

//	3、饿汉式非lazy，线程安全，效率提高，浪费内存
//	private static Singleton instance = new Singleton();
//
//	private Singleton() {
//
//	}
//
//	public static Singleton getInstance() {
//		return instance;
//	}
// 4.双重校验锁 DCL（double checked locking） lazy，线程安全，高效率
//	volatile禁止进行指令重排序
	private volatile static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
//	5.登记式/静态内部类 lazy,线程安全，适用于静态域
//	private static class SingletonHolder {
//		private static final Singleton INSTANCE = new Singleton();
//	}
//
//	private Singleton() {
//
//	}
//
//	public static final Singleton getInstance() {
//		return SingletonHolder.INSTANCE;
//	}
}
