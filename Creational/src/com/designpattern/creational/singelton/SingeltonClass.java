package com.designpattern.creational.singelton;

public class SingeltonClass {

	private static SingeltonClass singelton = null;

	public static synchronized SingeltonClass getinstance() {
		if (singelton == null) {
			synchronized (SingeltonClass.class) {
				if (singelton == null) {
					singelton = new SingeltonClass();
				}
			}
		}
		return singelton;
	}
}
