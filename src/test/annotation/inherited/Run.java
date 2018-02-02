package test.annotation.inherited;

/**
 * @author sherlock
 * @since 2/2/18.
 */
public class Run {
    public static void main(String[] args) {
        A a = new A();

        if (a.getClass().isAnnotationPresent(InheritanceAnnoTester.class)) {
            System.out.println("InheritanceAnnoTester annotation present");
        } else {
            System.out.println("Not present");
        }
    }
}
