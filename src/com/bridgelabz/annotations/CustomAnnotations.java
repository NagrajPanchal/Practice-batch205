package com.bridgelabz.annotations;
/*
Custom annotations or Java User-defined annotations are easy to create and use.
The @interface element is used to declare an annotation.

1. Method should not have any throws clauses
2. Method should return one of the following: primitive data types, String, Class, enum or array of these data types.
3. Method should not have any parameter.
4. We should attach @ just before interface keyword to define annotation.
5. It may assign a default value to the method.
*/

import java.lang.annotation.*;
import java.lang.reflect.Method;

/*
There are three types of annotations.

1. Marker Annotation
2. Single-Value Annotation
3. Multi-Value Annotation
*/
// 1. Marker Annotation
// An annotation that has no method, is called marker annotation
@interface MyAnnotation{}

// 2. Single-Value Annotation
// An annotation that has one method, is called single-value annotation
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@interface MyAnnotation1{
    int value();
}


// default values
/*
@interface MyAnnotation{
int value() default 0;
}
 */


// 3. Multi-Value Annotation
// An annotation that has more than one method, is called Multi-Value annotation
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@interface MyAnnotation2
{
    int value1();
    String value2();
    String value3();
}
@MyAnnotation2(value1=10,value2="Arun Kumar",value3="Ghaziabad")
/*
@interface MyAnnotation3
{
int value1() default 1;
String value2() default "";
String value3() default "xyz";
}
*/
class Hello
{
    @MyAnnotation1(value=10)
    void sayHello()
    {
        System.out.println("Hello Annotation");
    }
}

public class CustomAnnotations
{
    public static void main(String[] args) throws Exception
    {
Hello hello = new Hello();
hello.sayHello();
        Method method = hello.getClass().getMethod("Say Hello");

        MyAnnotation1 myAnnotation1 = method.getAnnotation(MyAnnotation1.class);
        System.out.println("Value is : "+myAnnotation1.value());
    }
}
