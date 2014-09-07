package com.slgerkamp.introductionToJavaFrameworkDevelopment.metaPrograming;

import java.lang.reflect.Field;

/**
 * String.classのメタデータ（フィールド）を取得
 *
 */
public class FieldMetaData {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<System> clazz = System.class;
		
		Field[] fields = clazz.getFields();
		
		System.out.println("System.classのフィールドを出力");
		for(Field f : fields){
			System.out.println(f);
		}
		
		System.out.println("System.classのoutフィールドを出力");
		Field outField = clazz.getField("out");
		System.out.println(outField);
		
		
		System.out.println("System.classのsafesフィールドを出力");
		Field safeField = clazz.getField("safe");
		System.out.println(safeField);
		
	}
}
