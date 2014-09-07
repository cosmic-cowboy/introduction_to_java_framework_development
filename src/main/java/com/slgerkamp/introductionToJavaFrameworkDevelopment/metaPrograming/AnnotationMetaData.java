package com.slgerkamp.introductionToJavaFrameworkDevelopment.metaPrograming;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;

/**
 * Baz.class（自前）のメタデータ（アノテーション）を取得
 *
 */
public class AnnotationMetaData {

	public static void main(String[] args) {

		Class<Baz> clazz = Baz.class;
		System.out.println("Baz.classのアノテーションを出力");
		Annotation[] annotations = clazz.getAnnotations();
		for(Annotation a : annotations){
			System.out.println(a);
		}
		
		System.out.println("Baz.classのInheritedアノテーションを出力");
		Inherited annotation = clazz.getAnnotation(Inherited.class);
		System.out.println(annotation);

	}
	
	
	@Deprecated
	public static class Baz{
		
	}
}
