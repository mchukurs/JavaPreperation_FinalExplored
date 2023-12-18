import com.chukurs.generic.BaseClass;
import consumer.specific.ChildClass;
import external.util.Logger;

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
        Logger.logToConsole("hello");


        StringBuilder tracker = new StringBuilder("Step 1 os abc");
        Logger.logToConsole(tracker);
        tracker.append(", Step 2 is xyz");
        Logger.logToConsole(tracker);
        System.out.println("After logging: "+tracker);
        System.out.println("-".repeat(20));

        tracker.append("Step 1 is ABC");
        Logger.logToConsole(tracker.toString());
        tracker.append(", Step 2 is XYZ");
        Logger.logToConsole(tracker.toString());
        System.out.println("After logging: "+tracker);


    }

    private static void doXYZ(String x, int y,final StringBuilder z) {
        final String c = x + y;
        System.out.println("c = " + c);
        x = c;
        z.append(y);
    }

}