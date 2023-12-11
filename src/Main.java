import com.chukurs.generic.BaseClass;
import consumer.specific.ChildClass;

public class Main {
    public static void main(String[] args) {
        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();

        BaseClass childReferredToAsBase = new ChildClass();
        System.out.println("parent");
        parent.recommendedMethod();
        System.out.println("-".repeat(20));
        System.out.println("childReferredToAsBase");
        childReferredToAsBase.recommendedMethod();
        System.out.println("-".repeat(20));
        System.out.println("child");
        child.recommendedMethod();
        System.out.println("-".repeat(20));

        System.out.println("parent");
        parent.recommendedStatic();
        System.out.println("-".repeat(20));
        System.out.println("childReferredToAsBase");
        childReferredToAsBase.recommendedStatic();
        System.out.println("-".repeat(20));
        System.out.println("child");
        child.recommendedStatic();

        String xArgument = "This is all I have got to say about Section ";
        StringBuilder zArgument = new StringBuilder("only saying this: Section ");
        doXYZ(xArgument, 16,zArgument);
        System.out.println("After Method, xArgument: "+ xArgument);
        System.out.println("After Method, zArgument: "+ zArgument);
    }

    private static void doXYZ(String x, int y,final StringBuilder z) {
        final String c = x + y;
        System.out.println("c = " + c);
        x = c;
        z.append(y);
    }

}