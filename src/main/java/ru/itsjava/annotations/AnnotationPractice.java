package ru.itsjava.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AnnotationPractice {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        Person ivan = new Person("Vanya", true);
//        System.out.println(ivan);
//
//        Class<? extends Person> aClass = ivan.getClass();
//
//        System.out.println(aClass.getName());
//        System.out.println(aClass.getSimpleName());

//        Class<?> personClass = Class.forName("ru.itsjava.annotations.Person");
//        System.out.println(personClass.getName());
//        Person vanya = (Person) personClass.getConstructor(String.class, Boolean.TYPE).newInstance("Vanya", true);
//        System.out.println(vanya);
//        System.out.println(personClass.getAnnotations()[0]);
//
//        Field isGood = personClass.getDeclaredField("isGood");
//        isGood.setAccessible(true);
//
//        isGood.setBoolean(vanya, false);
//        System.out.println(vanya);

        Class<?> mathStudentClass = Class.forName("ru.itsjava.annotations.MathStudent");
        MathStudent studentMath = (MathStudent) mathStudentClass.getConstructor(String.class, String.class, Integer.TYPE).
                newInstance("Ivan", "Ivanov", 2);
        System.out.println(studentMath);

        Field course = mathStudentClass.getDeclaredField("course");
        course.setAccessible(true);
        course.setInt(studentMath, 3);
        System.out.println(studentMath);

        System.out.println(mathStudentClass.getAnnotations()[0]);

        Class<?> biologyStudentClass = Class.forName("ru.itsjava.annotations.BiologyStudent");
        System.out.println(biologyStudentClass.getAnnotations()[0]);

    }
}
