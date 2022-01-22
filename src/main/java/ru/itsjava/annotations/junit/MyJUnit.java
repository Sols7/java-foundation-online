package ru.itsjava.annotations.junit;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class MyJUnit {
    private final Object objTestClass;
    private int passedTests = 0;
    private int failedTests = 0;
    private final List<Method> beforeAllMethods = new ArrayList<>();
    private final List<Method> afterAllMethods = new ArrayList<>();
    private final List<Method> testMethods = new ArrayList<>();
    private final List<Method> beforeMethods = new ArrayList<>();

    @SneakyThrows
    public void start() {
        fillAllMethodsGroup();

        for (Method method : beforeAllMethods) {
            method.invoke(objTestClass);
        }

        for (Method method : testMethods) {
            for (Method beforeMethod : beforeMethods) {
                beforeMethod.invoke(objTestClass);
                System.out.println(beforeMethod.getName());
            }
            if (method.isAnnotationPresent(DisplayName.class)){
                String displayNameTest = method.getAnnotation(DisplayName.class).value();
                System.out.println(displayNameTest);
//                System.out.println(method.getAnnotation(DisplayName.class).value());
            }
            try {
                method.invoke(objTestClass);
                System.out.println(method.getName() + " PASSED!");
                passedTests++;
            } catch (InvocationTargetException exception) {
                System.out.println(method.getName() + " FAILED!");
                failedTests++;
            }
        }
        for (Method method : afterAllMethods) {
            method.invoke(objTestClass);
        }
        printResults();
    }

    private void fillAllMethodsGroup() {
        for (Method method : objTestClass.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(BeforeAll.class)) {
                beforeAllMethods.add(method);
            } else if (method.isAnnotationPresent(Test.class)) {
                testMethods.add(method);
            } else if (method.isAnnotationPresent(Before.class)) {
                beforeMethods.add(method);
            } else if (method.isAnnotationPresent(AfterAll.class)) {
                afterAllMethods.add(method);
            }
        }
    }

    private void printResults() {
        System.out.println("==============================================");
        System.out.println("Колличество пройденных тестов: " + passedTests);
        System.out.println("Колличество упавших тестов: " + failedTests);
        System.out.println("==============================================");
    }
}
