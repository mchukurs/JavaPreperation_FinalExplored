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

}
