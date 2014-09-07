package com.slgerkamp.introductionToJavaFrameworkDevelopment.metaPrograming;

import java.lang.reflect.Method;

/**
 * String.classのメタデータ（メソッド）を取得
 *
 */
public class MethodMetaData {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Class<String> clazz = String.class;
		
		Method[] methods = clazz.getMethods();
		
		System.out.println("String.classのpublic, protectedメソッドを出力");
		for(Method m : methods){
			System.out.println(m);
		}

		System.out.println("String.classのvalueOfメソッドを出力:引数がint");
		Method valueOfInt = clazz.getMethod("valueOf", int.class);
		System.out.println(valueOfInt);

		System.out.println("String.classのvalueOfメソッドを出力:引数がSystem.class");
		Method valueOfSystem = clazz.getMethod("valueOf", System.class);
		System.out.println(valueOfSystem);
		
	}
}
