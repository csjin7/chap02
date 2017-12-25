package chap02;

public @interface AnnotationName {
	String elementName1();
	int elementName2() default 5;
}
