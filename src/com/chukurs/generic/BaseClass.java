package com.chukurs.generic;

public class BaseClass {

    public final void recommendedMethod(){
        System.out.println("BaseClass.recommendedMethod: best way to do it");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod(){
        System.out.println("BaseClass.optionalMethod: Customize optional method");
    }
    private void mandatoryMethod(){
        System.out.println("BaseClass.mandatoryMethod: non-negotiable");
    }

    public static void recommendedStatic(){
        System.out.println("BaseClass.recommendedStatic: best way to do it");
        optionalStatic();
        mandatoryStatic();
    }

    protected static void optionalStatic(){
        System.out.println("BaseClass.optionalStatic: Customize optional method");
    }
    private static void mandatoryStatic(){
        System.out.println("BaseClass.mandatoryStatic: non-negotiable");
    }



}
