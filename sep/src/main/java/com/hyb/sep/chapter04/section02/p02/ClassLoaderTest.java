package com.hyb.sep.chapter04.section02.p02;

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println("current loader:" + loader);
        System.out.println("parent loader:" + loader.getParent());
        System.out.println("grandparent loader: " + loader.getParent().getParent());
    }
}
