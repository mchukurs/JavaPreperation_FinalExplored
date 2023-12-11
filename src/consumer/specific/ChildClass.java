package consumer.specific;

public class ChildClass extends com.chukurs.generic.BaseClass {
    @Override
    protected void optionalMethod() {
        System.out.println("EXTRA STUFF happening in childClass");
        super.optionalMethod();
    }

    //    @Override
//    public void recommendedMethod() {
//        System.out.println("thins done my way in childclass");
//        optionalMethod();
//    }
    private void mandatoryMethod() {
        System.out.println("ChildClass.mandatoryMethod: non-negotiable");
    }
    public static void recommendedStatic() {
        System.out.println("ChildClass.recommendedStatic: best way to do it");
        optionalStatic();
        //mandatoryStatic();
    }
}
