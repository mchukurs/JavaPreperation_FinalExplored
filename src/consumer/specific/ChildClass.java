package consumer.specific;

public class ChildClass extends com.chukurs.generic.BaseClass{
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
}
