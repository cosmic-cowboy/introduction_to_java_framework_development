package com.slgerkamp.introductionToJavaFrameworkDevelopment.metaPrograming;

import java.lang.reflect.Constructor;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Calendar.classのメタデータ（コンストラクタ）を取得
 *
 */
public class ConstructorMetaData {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
	
		Class<Calendar> clazz = Calendar.class;
		
		System.out.println("Calendar.classのコンストラクタを出力");
		Constructor<?>[] constructors = clazz.getConstructors();
		System.out.println(constructors.length);

		System.out.println("Calendar.classのコンストラクタを出力");
		Constructor<?> constructor = clazz.getDeclaredConstructor(TimeZone.class, Locale.class);
		System.out.println(constructor);
		
		System.out.println("Calendar.classのコンストラクタを出力");
		Constructor<?> constructor2 = clazz.getDeclaredConstructor(byte.class);
		System.out.println(constructor2);
	}
}
