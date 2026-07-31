package operators;

public class JavaOperators {

    public static void main(String[] args) {
        System.out.println("==== Logical Operators =====");
        //System.out.println(false & (5 / 0 == 0)); // Runtime Exception
        System.out.println(true && (5 / 0 == 0)); // false
        //System.out.println(true || (5 / 0 == 0)); // true
        //System.out.println("true = " + !true); // false
        //System.out.println(true ^ true); // false
        //System.out.println(true ^ false); // true
        //System.out.println(false ^ true); // true

    }
}
